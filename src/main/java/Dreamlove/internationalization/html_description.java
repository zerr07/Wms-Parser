package Dreamlove.internationalization;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "value")
public class html_description {
    @XmlElement(name = "value")
    private List<value> value = new ArrayList<>();

    public html_description() {
    }

    public List<value> getHtml_description() {
        return value;
    }

    public value getHtml_description(int id) {
        return value.get(id);
    }

    public void setHtml_description(value value) {
        this.value.add(value);
    }

    public void setHtml_description(String value, String lang) {
        Dreamlove.internationalization.value v = new Dreamlove.internationalization.value();
        v.setValue(value);
        v.setLang(lang);
        this.value.add(v);
    }
}