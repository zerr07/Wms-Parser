package Dreamlove.Process;

import Dreamlove.barcodes.barcode;
import WMS.product;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

public class WorkerNotThread {
    private final Integer counter;
    private final Dreamlove.product tempProd;
    private final Map.Entry<Integer, product> entry;
    private final Integer initialSize;
    private final Connection conn;
    public WorkerNotThread
            (
                    Connection conn,
                    Integer counter,
                    Dreamlove.product tempProd,
                    Map.Entry<Integer, product> entry,
                    Integer initialSize
            ){
        this.counter = counter;
        this.conn = conn;
        this.tempProd = tempProd;
        this.entry = entry;
        this.initialSize = initialSize;
    }
    public void run(){
        try {

            if (tempProd.isValid()) {
                /* First run only */
                WMS.Queries.DeleteSupplierData(
                        conn,
                        entry.getKey(),
                        "Dreamlove"
                );
                WMS.Queries.DeleteBarcodes(
                        conn,
                        entry.getKey()
                );
                WMS.Queries.InsertSupplierData(
                        conn,
                        entry.getKey(),
                        tempProd.getProduct_url(),
                        tempProd.getCost_price(),
                        "Dreamlove",
                        tempProd.getPublic_id()
                );
                if (tempProd.getBarcodes() != null){
                    for (barcode code : tempProd.getBarcodes().getBarcode())
                        WMS.Queries.InsertBarcode(
                                conn,
                                entry.getKey(),
                                code.getBarcode()
                        );
                }
                /* Delete and then create loc */
                WMS.Queries.DeleteProductLocation(
                        conn,
                        entry.getKey(),
                        1,
                        "Dreamlove ladu"
                );
                WMS.Queries.InsertProductLocation(
                        conn,
                        entry.getKey(),
                        1,
                        "Dreamlove ladu",
                        tempProd.getStock().getSumQty()
                );
                System.out.println(counter + " " + entry.getKey() + " is valid | Create loc (first run recreate supplier) | " + ParserProcess.catalog.getSize()+"/"+initialSize+" "+Thread.currentThread().getName());
            } else {
                /* Delete and then create loc */
                WMS.Queries.DeleteProductLocation(
                        conn,
                        entry.getKey(),
                        1,
                        "Dreamlove ladu"
                );
                System.out.println(counter + " " + entry.getKey() + " " + entry.getValue().getEan() + " is not valid | Remove location " + ParserProcess.catalog.getSize()+"/"+initialSize+" "+Thread.currentThread().getName());
            }
            ParserProcess.catalog.removeFromCatalog(tempProd);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }
}
