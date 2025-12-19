
package Class;

import java.util.Arrays;


public class Item {
    private Product product;
    private int[] stock ;

    public Item(Product product, int amount) {
        this.product = product;
        this.stock = new int[] {0, amount};
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int[] getStock() {
        return stock;
    }

    public void setStock(int[] stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Item{" + "product=" + product.toString() + ", stock=" + Arrays.toString(stock) + '}';
    }
    
}
