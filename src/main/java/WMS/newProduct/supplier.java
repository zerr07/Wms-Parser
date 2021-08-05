package WMS.newProduct;

public class supplier {
    private String name;
    private String url;
    private double price;
    private double recPrice;
    private String sku;
    private int idTypeLocation;
    private String nameLocation;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRecPrice() {
        return recPrice;
    }

    public void setRecPrice(double recPrice) {
        this.recPrice = recPrice;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getIdTypeLocation() {
        return idTypeLocation;
    }

    public void setIdTypeLocation(int idTypeLocation) {
        this.idTypeLocation = idTypeLocation;
    }

    public String getNameLocation() {
        return nameLocation;
    }

    public void setNameLocation(String nameLocation) {
        this.nameLocation = nameLocation;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
