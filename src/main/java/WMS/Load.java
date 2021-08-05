package WMS;

import packages.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Load {
    public static Map<Integer, product> productList(){
        Map<Integer, product> WmsProducts = new HashMap<>();
        try {
            Connection conn = DB.conn();

            System.out.println("Loading product list from WMS");
            System.out.println("This might take a while");
            ResultSet products = conn.createStatement().executeQuery("SELECT products.id as `id`, " +
                    "(SELECT `name` FROM product_name WHERE id_product=products.id AND product_name.id_lang=2 LIMIT 1) as `name`, " +
                    "(SELECT `SKU` FROM supplier_data WHERE id_item=products.id AND supplierName='Dreamlove' LIMIT 1) as `SKU` " +
                    "FROM products");


            while (products.next()){
                Integer id = products.getInt("id");
                //String ean = products.getString("pc.ean");
                String sku = products.getString("SKU");
                product p;
                if (WmsProducts.containsKey(id)){
                    p = WmsProducts.get(id);
                } else {
                    p = new product(products.getString("name"));
                }
                /*if (ean != null){
                    if (!p.existEan(ean))
                        p.setEan(ean);
                }*/
                if (sku != null){
                    if (!p.existSku(sku))
                        p.setSku(sku);
                }
                if (!WmsProducts.containsKey(id)){
                    WmsProducts.put(id, p);
                }
            }
            ResultSet codes = conn.createStatement().executeQuery("SELECT id_product, ean FROM product_codes");
            while (codes.next()){
                Integer id = codes.getInt("id_product");
                String ean = codes.getString("ean");
                if (WmsProducts.containsKey(id)){
                    product p = WmsProducts.get(id);
                    if (ean != null){
                        if (!p.existEan(ean))
                            p.setEan(ean);
                    }
                }
            }
            conn.close();
            System.out.println("Product list loaded");
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
            System.out.println("An error occurred during SQL execution.\nExiting");
            System.exit(1);
        }
        return WmsProducts;
    }
}
