package WMS;

import java.sql.Connection;
import java.sql.SQLException;

public class Queries {
    public static void InsertSupplierData(
            Connection conn,
            int id_product,
            String url,
            double price,
            String supplierName,
            String sku
    ) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO supplier_data (id_item, URL, price, priceVAT, supplierName, SKU) VALUES ('%s', '%s', null, '%s', '%s', '%s');"
                .formatted(id_product, url, price, supplierName, sku);
        conn.createStatement().executeUpdate(query);
    }
    public static void DeleteSupplierData(
            Connection conn,
            int id_product,
            String supplierName
    ) throws SQLException, ClassNotFoundException  {
        String query = "DELETE FROM supplier_data WHERE id_item='%s' AND supplierName = '%s';"
            .formatted(id_product, supplierName);
        conn.createStatement().executeUpdate(query);
    }
    public static void InsertProductLocation(
            Connection conn,
            int id_product,
            int idType,
            String locationName,
            int qty
    ) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO product_locations (id_item, location, id_type, quantity) VALUES ('%s', '%s', '%s', '%s');"
                .formatted(id_product, locationName, idType, qty);
        conn.createStatement().executeUpdate(query);
    }
    public static void DeleteProductLocation(
            Connection conn,
            int id_product,
            int idType,
            String locationName
    ) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM product_locations WHERE id_item='%s' AND id_type='%s' AND location='%s';"
                .formatted(id_product, idType, locationName);
        conn.createStatement().executeUpdate(query);
    }
    public static void InsertBarcode(
            Connection conn,
            int id_product,
            String code
    ) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO product_codes (id_product, ean) VALUES ('%s', '%s');"
                .formatted(id_product, code);
        conn.createStatement().executeUpdate(query);
    }
    public static void DeleteBarcodes(
            Connection conn,
            int id_product
    ) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM product_codes WHERE id_product='%s';"
                .formatted(id_product);
        conn.createStatement().executeUpdate(query);
    }

}
