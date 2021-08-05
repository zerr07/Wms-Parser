package Dreamlove.stock;

import javax.xml.bind.annotation.*;

public class location {
    private int value;
    private String path;
    public location(){}

    public int getValue() {
        return value;
    }

    @XmlAttribute(name = "path")
    public void setPath(String path) {
        this.path = path;
    }

    @XmlValue
    public void setValue(int value) {
        this.value = value;
    }

    public String getPath() {
        return path;
    }
}
