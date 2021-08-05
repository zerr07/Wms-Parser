package Dreamlove.size;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "size")
@XmlType(propOrder = {"width", "height", "depth"})
public class size {
    private int width;
    private int height;
    private int depth;
    private String unit;

    public size(){}

    public String getUnit() {
        return unit;
    }

    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @XmlAttribute(name = "unit")
    public void setUnit(String unit) {
        this.unit = unit;
    }
    @XmlElement(name = "depth")
    public void setDepth(int depth) {
        this.depth = depth;
    }
    @XmlElement(name = "height")
    public void setHeight(int height) {
        this.height = height;
    }
    @XmlElement(name = "width")
    public void setWidth(int width) {
        this.width = width;
    }
}
