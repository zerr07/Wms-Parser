package Dreamlove;

import packages.CDataAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name = "product")
@XmlType(propOrder = {"id", "public_id", "updated", "unit_of_measurement", "available", "cost_price",
        "price", "recommended_retail_price", "product_url", "default_shipping_cost", "delivery_desc",
        "with_serial_number", "min_units_per_order", "max_units_per_order", "vat", "title", "description",
        "html_description", "release_date", "prepaid_reservation", "destocking", "brand", "brand_hierarchy",
        "shipping_weight", "sale", "size", "refrigerated", "_new", "barcodes", "categories", "internationalization",
        "images", "stock", "hs_intrastat_code"})

public class product {
    private int id;
    private String public_id;
    private String updated;
    private String unit_of_measurement;
    private int available;
    private double cost_price;
    private double price;
    private double recommended_retail_price;
    private String product_url;
    private double default_shipping_cost;
    private String delivery_desc;
    private int with_serial_number;
    private int min_units_per_order;
    private int max_units_per_order;
    private double vat;
    private String title;
    private String description;
    private String html_description;
    private String release_date;
    private int prepaid_reservation;
    private int destocking;
    private String brand;
    private String brand_hierarchy;
    private Dreamlove.others.shipping_weight shipping_weight;
    private Dreamlove.others.sale sale;
    private Dreamlove.size.size size;
    private Dreamlove.others.refrigerated refrigerated;
    private Dreamlove.others._new _new;
    private Dreamlove.barcodes.barcodes barcodes;
    private Dreamlove.categories.categories categories;
    private Dreamlove.internationalization.internationalization internationalization;
    private Dreamlove.images.images images;
    private Dreamlove.stock.stock stock;
    private String hs_intrastat_code;

    public product() {
    }

    @XmlElement(name = "id")
    public void setId(int id) {
        this.id = id;
    }
    @XmlElement(name = "public_id")
    public void setPublic_id(String public_id) {
        this.public_id = public_id;
    }
    @XmlElement(name = "updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }
    @XmlElement(name = "unit_of_measurement")
    public void setUnit_of_measurement(String unit_of_measurement) {
        this.unit_of_measurement = unit_of_measurement;
    }
    @XmlElement(name = "available")
    public void setAvailable(int available) {
        this.available = available;
    }
    @XmlElement(name = "cost_price")
    public void setCost_price(double cost_price) {
        this.cost_price = cost_price;
    }
    @XmlElement(name = "price")
    public void setPrice(double price) {
        this.price = price;
    }
    @XmlElement(name = "recommended_retail_price")
    public void setRecommended_retail_price(double recommended_retail_price) {
        this.recommended_retail_price = recommended_retail_price;
    }
    @XmlElement(name = "product_url")
    public void setProduct_url(String product_url) {
        this.product_url = product_url;
    }
    @XmlElement(name = "default_shipping_cost")
    public void setDefault_shipping_cost(double default_shipping_cost) {
        this.default_shipping_cost = default_shipping_cost;
    }
    @XmlElement(name = "delivery_desc")
    public void setDelivery_desc(String delivery_desc) {
        this.delivery_desc = delivery_desc;
    }
    @XmlElement(name = "with_serial_number")
    public void setWith_serial_number(int with_serial_number) {
        this.with_serial_number = with_serial_number;
    }
    @XmlElement(name = "min_units_per_order")
    public void setMin_units_per_order(int min_units_per_order) {
        this.min_units_per_order = min_units_per_order;
    }
    @XmlElement(name = "max_units_per_order")
    public void setMax_units_per_order(int max_units_per_order) {
        this.max_units_per_order = max_units_per_order;
    }
    @XmlElement(name = "vat")
    public void setVat(double vat) {
        this.vat = vat;
    }
    @XmlElement(name = "title")
    @XmlJavaTypeAdapter(CDataAdapter.class)
    public void setTitle(String title) {
        this.title = title;
    }
    @XmlElement(name = "description")
    @XmlJavaTypeAdapter(CDataAdapter.class)
    public void setDescription(String description) {
        this.description = description;
    }
    @XmlElement(name = "html_description")
    @XmlJavaTypeAdapter(CDataAdapter.class)
    public void setHtml_description(String html_description) {
        this.html_description = html_description;
    }
    @XmlElement(name = "release_date")
    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
    @XmlElement(name = "prepaid_reservation")
    public void setPrepaid_reservation(int prepaid_reservation) {
        this.prepaid_reservation = prepaid_reservation;
    }
    @XmlElement(name = "destocking")
    public void setDestocking(int destocking) {
        this.destocking = destocking;
    }
    @XmlElement(name = "brand")
    @XmlJavaTypeAdapter(CDataAdapter.class)
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @XmlElement(name = "brand_hierarchy")
    @XmlJavaTypeAdapter(CDataAdapter.class)
    public void setBrand_hierarchy(String brand_hierarchy) {
        this.brand_hierarchy = brand_hierarchy;
    }
    @XmlElement(name = "shipping_weight")
    public void setShipping_weight(Dreamlove.others.shipping_weight shipping_weight) {
        this.shipping_weight = shipping_weight;
    }
    @XmlElement(name = "sale")
    public void setSale(Dreamlove.others.sale sale) {
        this.sale = sale;
    }
    @XmlElement(name = "size")
    public void setSize(Dreamlove.size.size size) {
        this.size = size;
    }
    @XmlElement(name = "refrigerated")
    public void setRefrigerated(Dreamlove.others.refrigerated refrigerated) {
        this.refrigerated = refrigerated;
    }
    @XmlElement(name = "new")
    public void set_new(Dreamlove.others._new _new) {
        this._new = _new;
    }
    @XmlElement(name = "barcodes")
    public void setBarcodes(Dreamlove.barcodes.barcodes barcodes) {
        this.barcodes = barcodes;
    }
    @XmlElement(name = "categories")
    public void setCategories(Dreamlove.categories.categories categories) {
        this.categories = categories;
    }
    @XmlElement(name = "internationalization")
    public void setInternationalization(Dreamlove.internationalization.internationalization internationalization) {
        this.internationalization = internationalization;
    }
    @XmlElement(name = "images")
    public void setImages(Dreamlove.images.images images) {
        this.images = images;
    }
    @XmlElement(name = "stock")
    public void setStock(Dreamlove.stock.stock stock) {
        this.stock = stock;
    }
    @XmlElement(name = "hs_intrastat_code")
    public void setHs_intrastat_code(String hs_intrastat_code) {
        this.hs_intrastat_code = hs_intrastat_code;
    }

    public int getId() {
        return id;
    }

    public String getPublic_id() {
        return public_id;
    }

    public String getUpdated() {
        return updated;
    }

    public String getUnit_of_measurement() {
        return unit_of_measurement;
    }

    public int getAvailable() {
        return available;
    }

    public double getCost_price() {
        return cost_price;
    }

    public double getPrice() {
        return price;
    }

    public double getRecommended_retail_price() {
        return recommended_retail_price;
    }

    public String getProduct_url() {
        return product_url;
    }

    public double getDefault_shipping_cost() {
        return default_shipping_cost;
    }

    public String getDelivery_desc() {
        return delivery_desc;
    }

    public int getWith_serial_number() {
        return with_serial_number;
    }

    public int getMin_units_per_order() {
        return min_units_per_order;
    }

    public int getMax_units_per_order() {
        return max_units_per_order;
    }

    public double getVat() {
        return vat;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getHtml_description() {
        return html_description;
    }

    public String getRelease_date() {
        return release_date;
    }

    public int getPrepaid_reservation() {
        return prepaid_reservation;
    }

    public int getDestocking() {
        return destocking;
    }

    public String getBrand() {
        return brand;
    }

    public String getBrand_hierarchy() {
        return brand_hierarchy;
    }

    public Dreamlove.others.shipping_weight getShipping_weight() {
        return shipping_weight;
    }

    public Dreamlove.others.sale getSale() {
        return sale;
    }

    public Dreamlove.size.size getSize() {
        return size;
    }

    public Dreamlove.others.refrigerated getRefrigerated() {
        return refrigerated;
    }

    public Dreamlove.others._new get_new() {
        return _new;
    }

    public Dreamlove.barcodes.barcodes getBarcodes() {
        return barcodes;
    }

    public Dreamlove.categories.categories getCategories() {
        return categories;
    }

    public Dreamlove.internationalization.internationalization getInternationalization() {
        return internationalization;
    }

    public Dreamlove.images.images getImages() {
        return images;
    }

    public Dreamlove.stock.stock getStock() {
        return stock;
    }

    public String getHs_intrastat_code() {
        return hs_intrastat_code;
    }
    public boolean isValid() {
        return this.public_id != null;
    }
}
