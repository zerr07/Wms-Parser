package Dreamlove.internationalization;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "title")
public class title {
    @XmlElement(name = "value")
    private List<value> value = new ArrayList<>();
    public title(){}

    public List<value> getTitle() {
        return value;
    }

    public value getTitle(int id) {
        return value.get(id);
    }

    public void setTitle(value value) {
        this.value.add(value);
    }
    public void setValue(String value, String lang) {
        Dreamlove.internationalization.value v = new Dreamlove.internationalization.value();
        v.setValue(value);
        v.setLang(lang);
        this.value.add(v);
    }

}
