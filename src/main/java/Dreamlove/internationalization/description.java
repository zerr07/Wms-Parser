package Dreamlove.internationalization;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "description")
public class description {
    @XmlElement(name = "value")
    private List<value> value = new ArrayList<>();
    public description(){}

    public List<value> getDescription() {
        return value;
    }

    public value getDescription(int id) {
        return value.get(id);
    }

    public void setDescription(value value) {
        this.value.add(value);
    }
    public void setDescription(String value, String lang) {
        Dreamlove.internationalization.value v = new Dreamlove.internationalization.value();
        v.setValue(value);
        v.setLang(lang);
        this.value.add(v);
    }
}