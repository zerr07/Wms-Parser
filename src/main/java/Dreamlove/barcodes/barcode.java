package Dreamlove.barcodes;

import packages.CDataAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "barcode")
public class barcode {
    private String barcode;
    private String type;
    public barcode(){}

    public String getBarcode() {
        return barcode;
    }
    @XmlValue
    @XmlJavaTypeAdapter(CDataAdapter.class)
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getType() {
        return type;
    }
    @XmlAttribute(name = "type")
    public void setType(String type) {
        this.type = type;
    }
}
