package WMS;

import java.util.ArrayList;
import java.util.List;

public class product {
    private String name;
    private List<String> ean = new ArrayList<>();
    private List<String> sku = new ArrayList<>();
    public product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getEan() {
        return ean;
    }

    public String getEan(int id){
        return ean.get(id);
    }

    public void setEan(String ean) {
        this.ean.add(ean);
    }

    public boolean existEan(String ean) {
        for (String temp : this.ean) {
            if (temp.equals(ean))
                return true;
        }
        return false;
    }

    public List<String> getSku() {
        return sku;
    }

    public String getSku(int id){
        return sku.get(id);
    }

    public void setSku(String sku) {
        this.sku.add(sku);
    }

    public boolean existSku(String sku) {
        for (String temp : this.sku) {
            if (temp.equals(sku))
                return true;
        }
        return false;
    }

}
