package Dreamlove.images;

import packages.CDataAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "image")
@XmlType(propOrder = {"name", "src"})
public class image {
    private String name;
    private String src;
    private String base64Code;
    private int preferred;
    public image(){}

    public String getName() {
        return name;
    }

    public String getSrc() {
        return src;
    }
    public String getBase64Code() {
        return base64Code;
    }
    @XmlAttribute(name = "preferred")
    public void setPreferred(int preferred) {
        this.preferred = preferred;
    }

    @XmlElement(name = "name")
    @XmlJavaTypeAdapter(CDataAdapter.class)
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "src")
    public void setSrc(String src) {
        this.src = src;
    }

    @XmlTransient
    public void setBase64Code(String url){
        this.base64Code = packages.base64.convertUrlToBase64(url);
    }
    public int getPreferred() {
        return preferred;
    }
}
