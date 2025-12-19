package Class;

import java.util.List;

public class Bill {

    private String buyer;
    private String ccBuyer;
    private String emailBuyer;
    private String seller;
    private String date;
    private float totalPrice;
    private List<String> products;
    private String id;

    public Bill(String buyer, String ccBuyer, String emailBuyer, String seller, String date, float totalPrice, List<String> products, String id) {
        this.buyer = buyer;
        this.ccBuyer = ccBuyer;
        this.emailBuyer = emailBuyer;
        this.seller = seller;
        this.date = date;
        this.totalPrice = totalPrice;
        this.products = products;
        this.id = id;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getCcBuyer() {
        return ccBuyer;
    }

    public void setCcBuyer(String ccBuyer) {
        this.ccBuyer = ccBuyer;
    }

    public String getEmailBuyer() {
        return emailBuyer;
    }

    public void setEmailBuyer(String emailBuyer) {
        this.emailBuyer = emailBuyer;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
