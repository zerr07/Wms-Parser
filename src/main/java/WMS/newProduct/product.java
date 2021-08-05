package WMS.newProduct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class product {
    private String prefix;
    private String tag;
    private double actPrice;
    private int override;
    private double marginPercent;
    private double marginNumber;
    private double width;
    private double height;
    private double depth;
    private int weight;
    private int category;
    private List<String> ean = new ArrayList<>();
    private Map<Integer, String> name = new HashMap<>();
    private WMS.newProduct.supplier supplier;
    private Map<String, String> description = new HashMap<>();
    private List<List<String>> images = new ArrayList<>();

    public List<String> getEan() {
        return ean;
    }

    public void setEan(List<String> ean) {
        this.ean = ean;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public double getActPrice() {
        return actPrice;
    }

    public void setActPrice(double actPrice) {
        this.actPrice = actPrice;
    }

    public int getOverride() {
        return override;
    }

    public void setOverride(int override) {
        this.override = override;
    }

    public double getMarginPercent() {
        return marginPercent;
    }

    public void setMarginPercent(double marginPercent) {
        this.marginPercent = marginPercent;
    }

    public double getMarginNumber() {
        return marginNumber;
    }

    public void setMarginNumber(double marginNumber) {
        this.marginNumber = marginNumber;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public Map<Integer, String> getName() {
        return name;
    }

    public void setName(Map<Integer, String> name) {
        this.name = name;
    }

    public supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(supplier supplier) {
        this.supplier = supplier;
    }

    public Map<String, String> getDescription() {
        return description;
    }

    public void setDescription(Map<String, String> description) {
        this.description = description;
    }

    public List<List<String>> getImages() {
        return images;
    }
    public List<String> getImages(int id) {
        return images.get(id);
    }
    public String getImage(int id) {
        return images.get(id).get(1);
    }
    public void setImages(List<List<String>> images) {
        this.images = images;
    }

}
