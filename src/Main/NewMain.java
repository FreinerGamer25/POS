/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package Main;
import Class.*;
import com.google.gson.Gson;
/**
 *
 * @author FreinerG2Co
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gson gson = new Gson();
       Inventory nv = new Inventory();
       nv.addItem(1, "Mara", 0, 0, "");
        System.out.println(nv.addItem(1, "Mara1", 0, 0, ""));
        nv.addItem(1, "Mara2", 1, 0, "");
        nv.addItem(1, "Mara3", 3, 0, "");
        nv.showItems();
        String json = gson.toJson(nv);
        Inventory invt = gson.fromJson(json, Inventory.class);
        System.out.println("->"+invt.getItem(1).getProduct().getName());
        nv.removeItem(0);
        System.out.println("\n");
        System.out.println(nv.sellProduct(0, 1));
        System.out.println(nv.sellProduct(1, 1));
        System.out.println(nv.sellProduct(1, 2));
        System.out.println(nv.sellProduct(1, 0));
        nv.showItems();
    }
    
}
