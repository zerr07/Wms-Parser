package Dreamlove.barcodes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "barcodes")
public class barcodes {
    @XmlElement(name = "barcode")
    private List<barcode> barcodes = new ArrayList<>();
    public barcodes(){

    }
    public void addToBarcodes(barcode p) {
        this.barcodes.add(p);
    }
    public int getSize(){
        return this.barcodes.size();
    }
    public List<barcode> getBarcodes() {
        return this.barcodes;
    }
    public barcode getFromBarcodes(int id) {
        return this.barcodes.get(id);
    }

    public List<barcode> getBarcode() {
        return this.barcodes;
    }
}
