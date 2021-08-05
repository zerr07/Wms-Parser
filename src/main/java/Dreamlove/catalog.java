package Dreamlove;

import Dreamlove.barcodes.barcode;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.*;

@XmlRootElement(name = "catalog")
public class catalog {
    @XmlElement(name = "product")
    private List<product> catalog = new ArrayList<>();
    public catalog(){

    }
    public void addToCatalog(product p) {
        this.catalog.add(p);
    }
    public void removeFromCatalog(product p) {
        this.catalog.remove(p);
    }

    public int getSize(){
        return this.catalog.size();
    }
    public List<product> getCatalog() {
        return this.catalog;
    }
    public product getFromCatalog(int id) {
        return this.catalog.get(id);
    }

    public product getProductBySKU(String sku){
        for (product p : this.catalog) {
            if (p.getPublic_id().equals(sku))
                return p;
        }
        return new product();
    }
    public product getProductByName(String name){
        for (product p : this.catalog) {
            if (p.getInternationalization().getTitleByLang("en-UK").equals(name))
                return p;
        }
        return new product();
    }
    public product getProductByEan(String ean) throws ConcurrentModificationException{
        for (product p : this.catalog) {
            if (p.getBarcodes() == null){
                continue;
            }
            List<barcode> barcodes = p.getBarcodes().getBarcode();
            for (barcode bar : barcodes){
                //if (bar.getType().equals("EAN-13")) {
                    if (bar.getBarcode().equals(ean))
                        return p;
                //}
            }
        }
        return new product();
    }
}
