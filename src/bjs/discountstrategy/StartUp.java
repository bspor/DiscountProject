
package bjs.discountstrategy;
/**
 * This is my startup class to demonstrate my project.
 * 
 * @author bspor
 * @author 
 */
public class StartUp {
    public static void main(String[] args) {
        String custID = "100";
        String prodId1 = "A101";
        String prodId2 = "B205";
        String prodID = "C222";
        int qty = 2;
        
        CashRegister cr = new CashRegister();
        cr.startNewSale(custID);
        cr.addItemToSale(prodId1, qty);
        cr.addItemToSale(prodID, 1);
        cr.addItemToSale(prodId2, 5);
        cr.finalizeSale();
    }
}
