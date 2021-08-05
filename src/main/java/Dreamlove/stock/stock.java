package Dreamlove.stock;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "stock")
@XmlType(propOrder = {})
public class stock {
    @XmlElement(name = "location")
    private List<location> stock = new ArrayList<>();
    public stock(){

    }
    public void addToStock(location p) {
        this.stock.add(p);
    }
    public int getSize(){
        return this.stock.size();
    }
    public List<location> getStock() {
        return this.stock;
    }
    public location getFromStock(int id) {
        return this.stock.get(id);
    }
    public int getSumQty(){
        int qty = 0;
        for (location loc : this.stock) {
            qty+=loc.getValue();
        }
        return qty;
    }
}