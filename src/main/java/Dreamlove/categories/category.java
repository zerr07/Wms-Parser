package Dreamlove.categories;

import javax.xml.bind.annotation.*;

@XmlType(propOrder = {"category"})
public class category {
    private String category;
    private int gesioid;
    private String ref;
    private int maincategory;

    public int getGesioid() {
        return gesioid;
    }

    public int getMaincategory() {
        return maincategory;
    }

    public String getCategory() {
        return category;
    }

    public String getRef() {
        return ref;
    }

    @XmlValue
    public void setCategory(String category) {
        this.category = category;
    }

    @XmlAttribute(name = "gesioid")
    public void setGesioid(int gesioid) {
        this.gesioid = gesioid;
    }

    @XmlAttribute(name = "maincategory")
    public void setMaincategory(int maincategory) {
        this.maincategory = maincategory;
    }

    @XmlAttribute(name = "ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

}
