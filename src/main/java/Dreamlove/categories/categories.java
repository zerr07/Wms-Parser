package Dreamlove.categories;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "categories")
public class categories {
    @XmlElement(name = "category")
    private List<category> categories = new ArrayList<>();
    public categories(){}
    public void addToCategories(category p) {
        this.categories.add(p);
    }
    public int getSize(){
        return this.categories.size();
    }
    public List<category> getCategories() {
        return this.categories;
    }
    public category getFromCategories(int id) {
        return this.categories.get(id);
    }

    public List<category> getCategory() {
        return this.categories;
    }
}
