package Dreamlove.images;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "images")
@XmlType(propOrder = {})
public class images {
    @XmlElement(name = "image")
    private List<image> images = new ArrayList<>();
    @XmlAttribute(name = "scope")
    private String scope = "all";
    public images(){

    }
    public void addToImages(image p) {
        this.images.add(p);
    }
    public int getSize(){
        return this.images.size();
    }
    public List<image> getImages() {
        return this.images;
    }
    public image getFromImages(int id) {
        return this.images.get(id);
    }

}
