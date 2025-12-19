
package Class;

import java.util.ArrayList;
import java.util.List;


public class Inventory {
    private List<Item> products = new ArrayList<>();

    public Inventory() {
    }
    
/***
 * Get the firt element mached
 * @param id product to shears
 * @return {@code Item} si fue encontrado de lo contrario retorna {@code Null}
 */
    public Item getItem(long id){
        for(Item prd : products){
            if(prd != null && prd.getProduct().getId() == id){
                return prd;
            }
        }
        return null;
    }
    
    public boolean addItem(int amount, String name, long id, float price, String img){
        if(getItem(id) != null){
            return false;
        }
        Item item = new Item( new Product(name, id, price, img), amount);
        products.add(item);
        return true;
    }
    
    public boolean removeItem(long id){
        return products.removeIf(item -> item.getProduct().getId() == id);
    }
    
    public int sellProduct(long id,int amount){
        Item item = getItem(id);
        if(item == null){
            return -1;//Producto no encontrado
        }
        if(item.getStock()[1] < amount || amount <= 0){
            return 1;//Unidades no disponibles
        }
        item.getStock()[1]-=amount;
        return 0;//Producto vendido;
    }
    
    public void showItems(){
        for(Item itm : products){
            System.out.println(itm.toString());
        }
    }
}
