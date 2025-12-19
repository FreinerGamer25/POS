
package Data;
import Class.Bill;
import java.util.ArrayList;
import java.util.List;
public class BillsData {
    public static List<Bill> bills = new ArrayList<>();
    static public Bill getBill(String billId){
        for (Bill i : bills) {
            if(i.getId().equals(billId)){
                return i;
            }
        }
        return null;
    }
    static public boolean registerBill(String buyer, String ccBuyer, String emailBuyer, String seller, String date, float totalPrice, List<String> products, String id){
        if (getBill(id) != null){
            return false;
        }
        bills.add( new Bill(buyer, ccBuyer, emailBuyer, seller, date, totalPrice, products, id));
        return true;
    }
    
   static public boolean removeBill(String billId){
       if (getBill(billId) == null){
            return false;
        }
       bills.removeIf(i-> i.getId().equals(billId));
       return true;
   }
   
   static public List<Bill> getBillsBySeller(String seller){
       return bills.stream().filter(bill -> bill.getSeller().equals(seller)).toList();
   }
   static public List<Bill> getBillsBySellerAndDate(String seller, String date){
       return bills.stream().filter(bill -> (bill.getSeller().equals(seller) && bill.getDate().split(" ")[0].equals(date))).toList();
   }
}
