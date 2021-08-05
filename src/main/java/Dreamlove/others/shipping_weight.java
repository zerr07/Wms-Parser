package Dreamlove.others;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "shipping_weight")
@XmlAccessorType(XmlAccessType.FIELD)
public class shipping_weight {
    @XmlAttribute(name = "unit")
    private String unit;
    @XmlValue
    private int weight;
    public shipping_weight(){}

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
