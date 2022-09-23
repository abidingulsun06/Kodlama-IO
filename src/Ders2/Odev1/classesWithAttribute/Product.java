package Ders2.Odev1.classesWithAttribute;

public class Product {

    private int id;
    private String productName;
    private String description;
    private double price;
    private int stockAmount;
    private String color;
    private String kod;

    public Product() {
    }

    public Product(int id, String productName, String description, double price, int stockAmount, String color) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKod() {
        return this.productName.substring(0, 1) +" "+ id;
    }
}
