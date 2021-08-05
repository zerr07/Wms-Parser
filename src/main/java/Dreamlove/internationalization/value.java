package Dreamlove.internationalization;

import packages.CDataAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "value")
@XmlAccessorType(XmlAccessType.FIELD)

public class value {
    @XmlAttribute(name = "lang")
    private String lang;
    @XmlValue
    @XmlJavaTypeAdapter(CDataAdapter.class)
    private String value;
    public value(){}

    public String getLang() {
        return lang;
    }

    public String getValue() {
        return value;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
