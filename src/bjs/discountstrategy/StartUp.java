
package bjs.discountstrategy;
/**
 * This is my startup class to demonstrate my project.
 * 
 * @author bspor
 * @
 */
public class StartUp {
    public static void main(String[] args) {
        String custID = "100";
        String prodId1 = "A101";
        String prodId2 = "A101";
        String prodID = "A101";
        int qty = 2;
        
        CashRegister cr = new CashRegister();
        cr.startNewSale(custID);
        cr.addItemToSale(prodId1, qty);
        cr.addItemToSale(prodID, 1);
        cr.addItemToSale(prodId2, 5);
        cr.finalizeSale();
    }
}
