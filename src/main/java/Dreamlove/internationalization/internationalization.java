package Dreamlove.internationalization;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "internationalization")
@XmlType(propOrder = {"title", "description", "html_description"})
public class internationalization {
    @XmlElement(name = "title")
    private List<title> title = new ArrayList<>();
    @XmlElement(name = "description")
    private List<description> description = new ArrayList<>();
    @XmlElement(name = "html_description")
    private List<html_description> html_description = new ArrayList<>();

    public internationalization(){}
    public void addToTitle(title p) {
        this.title.add(p);
    }
    public void addToDescription(description p) {
        this.description.add(p);
    }
    public void addToHtml_description(html_description p) {
        this.html_description.add(p);
    }
    public int getTitleSize(){
        return this.title.size();
    }
    public int getDescriptionSize(){
        return this.description.size();
    }
    public int getHtml_descriptionSize(){
        return this.html_description.size();
    }
    public List<title> getTitle() {
        return this.title;
    }
    public title getFromTitle(int id) {
        return this.title.get(id);
    }
    public List<description> getDescription() {
        return this.description;
    }
    public description getFromDescription(int id) {
        return this.description.get(id);
    }
    public List<html_description> getHtml_description() {
        return this.html_description;
    }
    public html_description getFromHtml_description(int id) {
        return this.html_description.get(id);
    }
    public String getTitleByLang(String lang) {
        for (int i = 0; i<this.title.size(); i++){
            for (value t: this.title.get(i).getTitle()) {
                if (t.getLang().equals(lang))
                    return t.getValue();
            }

        }
        return "NoTitleFoundSkipping";
    }
    public String getDescriptionByLang(String lang) {
        for (int i = 0; i<this.description.size(); i++){
            for (value t: this.description.get(i).getDescription()) {
                if (t.getLang().equals(lang))
                    return t.getValue();
            }

        }
        return "NoDescriptionFoundSkipping";
    }
    public String getHtml_descriptionByLang(String lang) {
        for (int i = 0; i<this.html_description.size(); i++){
            for (value t: this.html_description.get(i).getHtml_description()) {
                if (t.getLang().equals(lang))
                    return t.getValue();
            }

        }
        return "NoDescriptionFoundSkipping";
    }
}
