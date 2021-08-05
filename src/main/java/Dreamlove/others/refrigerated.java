package Dreamlove.others;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "refrigerated")
@XmlAccessorType(XmlAccessType.FIELD)
public class refrigerated {
    @XmlAttribute(name = "value")
    private String value;
    @XmlValue
    private String data;
    public refrigerated(){
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
