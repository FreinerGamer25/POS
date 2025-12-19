package Class;

public class Product {
    private String name;
    private long id;
    private float price;
    private String img;

    public Product(String name, long id, float price, String img) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public String getImg() {
        return img;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", id=" + id + ", price=" + price + ", img=" + img + '}';
    }
    
 
    
    
}
