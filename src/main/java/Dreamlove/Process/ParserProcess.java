package Dreamlove.Process;

import WMS.product;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import packages.DB;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParserProcess {
    public static Dreamlove.catalog catalog;
    public static void ProcessData(Dreamlove.catalog cat){
        Map<Integer, product> WmsProductList = WMS.Load.productList();
        catalog = cat;
        Integer initialSize = catalog.getSize();
        //ExecutorService executorService = Executors.newCachedThreadPool();
        Connection conn = null;
        try {
            conn = DB.conn();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("SQLException Dreamlove.Process");
            System.exit(1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ClassNotFoundException Dreamlove.Process");
            System.exit(1);
        }
        Integer c = 0;
        for (Map.Entry<Integer, product> entry : WmsProductList.entrySet()) {
            //if (entry.getKey() > 6725){
                Dreamlove.product tempProd = FindProduct(catalog,
                        entry.getValue().getName(),
                        entry.getValue().getSku(),
                        entry.getValue().getEan());
                new WorkerNotThread(conn, c, tempProd, entry, initialSize).run();
                /*Runnable worker = new WorkerThread(conn, c, tempProd, entry, initialSize);
                executorService.execute(worker);*/
            //}
            c++;
        }
        /*executorService.shutdown();
        System.out.println("Waiting for threads to complete and shutting down");
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(catalog.getSize() + " new products");
        System.out.println("Finished updating products\nAdding new");
        List<Dreamlove.product> tempCat = new ArrayList<>(catalog.getCatalog());
        for (Dreamlove.product p1 : tempCat){
            CreateNewProduct(p1);
            System.out.println(p1.getPublic_id() + " New product " + catalog.getSize()+"/"+initialSize);
            catalog.removeFromCatalog(p1);
        }

        /*int size = catalog.getSize();
        if (size < 3) {
            System.out.println("Size below 3");
            System.out.println(size);
        } else {
            for (int i = 0; i < 3; i++) {
                Dreamlove.product p = catalog.getFromCatalog(i);
                System.out.println(catalog.getFromCatalog(i).getId());
            }
        }
        System.out.println("site" + size);*/
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("SQLException Dreamlove.Process");
            System.exit(1);
        }
    }
    public static Dreamlove.product FindProduct(Dreamlove.catalog catalog, String name, List<String> sku, List<String> ean) {
        for (String tempSku : sku){
            if (catalog.getProductBySKU(tempSku).isValid())
                return catalog.getProductBySKU(tempSku);
        }
        for (String tempEan : ean){
            if (catalog.getProductByEan(tempEan).isValid())
                return catalog.getProductByEan(tempEan);
        }
        return catalog.getProductByName(name);
    }
    public static void CreateNewProduct(Dreamlove.product p1){
        WMS.newProduct.product newProd = new WMS.newProduct.product();
        newProd.setPrefix("LT");
        newProd.setTag("LT001");
        newProd.setActPrice(p1.getCost_price());
        newProd.setOverride(0);
        newProd.setMarginPercent(0.00);
        newProd.setMarginNumber(0.00);
        try {
            newProd.setWidth(p1.getSize().getWidth());
            newProd.setHeight(p1.getSize().getHeight());
            newProd.setDepth(p1.getSize().getDepth());
            newProd.setWeight(p1.getShipping_weight().getWeight());
        } catch (NullPointerException e){
            newProd.setWidth(0.00);
            newProd.setHeight(0.00);
            newProd.setDepth(0.00);
            newProd.setWeight(0);
        }
        newProd.setCategory(328);

        Map<Integer, String> names = new HashMap<>();
        names.put(1, p1.getInternationalization().getTitleByLang("en-UK"));
        names.put(2, p1.getInternationalization().getTitleByLang("en-UK"));
        names.put(3, p1.getInternationalization().getTitleByLang("en-UK"));
        names.put(4, p1.getInternationalization().getTitleByLang("en-UK"));
        names.put(6, p1.getInternationalization().getTitleByLang("en-UK"));
        newProd.setName(names);

        WMS.newProduct.supplier supplier = new WMS.newProduct.supplier();
        supplier.setName("Dreamlove");
        supplier.setUrl(p1.getProduct_url());
        supplier.setPrice(p1.getCost_price());
        supplier.setRecPrice(p1.getRecommended_retail_price());
        supplier.setSku(p1.getPublic_id());
        supplier.setIdTypeLocation(1);
        supplier.setNameLocation("Dreamlove ladu");
        supplier.setQuantity(p1.getStock().getSumQty());
        newProd.setSupplier(supplier);

        Map<String, String> description = new HashMap<>();
        description.put("ru", p1.getInternationalization().getHtml_descriptionByLang("en-UK"));
        description.put("en", p1.getInternationalization().getHtml_descriptionByLang("en-UK"));
        description.put("et", p1.getInternationalization().getHtml_descriptionByLang("en-UK"));
        description.put("lv", p1.getInternationalization().getHtml_descriptionByLang("en-UK"));
        description.put("lt", p1.getInternationalization().getHtml_descriptionByLang("en-UK"));
        description.put("FB", p1.getInternationalization().getHtml_descriptionByLang("en-UK"));
        newProd.setDescription(description);
        List<List<String>> images = new ArrayList<>();

        if (p1.getImages() != null) {
            for (Dreamlove.images.image img : p1.getImages().getImages()) {
                List<String> image = new ArrayList<>();
                image.add("new");
                img.setBase64Code(img.getSrc());
                image.add(img.getBase64Code());
                images.add(image);
            }
        }
        newProd.setImages(images);

        List<String> ean = new ArrayList<>();
        if (p1.getBarcodes() != null){
            for (Dreamlove.barcodes.barcode barcode : p1.getBarcodes().getBarcodes()){
                ean.add(barcode.getBarcode());
            }
        }
        newProd.setEan(ean);

        ObjectMapper objectMapper = new ObjectMapper();
        try {

            String body = objectMapper.writeValueAsString(newProd);
            URL url = new URL("https://ass.azdev.eu/api/product");
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setRequestProperty("Cookie", "shard=Main; id_shard=1");
            con.setRequestProperty("token", "72c84b37162db18f7048aee516c3d1d63b7e04bc83da6f59b38db2325668cf01c1fed266");
            con.setDoOutput(true);
            try(OutputStream os = con.getOutputStream()) {
                byte[] input = body.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(con.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println(response.toString());
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

