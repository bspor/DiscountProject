
package bjs.discountstrategy;
/**
 * This is my startup class to demonstrate my project.
 * 
 * @author bspor
 * @params need to manually enter custID, and prodIds
 */
public class StartUp {

    public static void main(String[] args) {
        String custID = "100";
        String prodId1 = "A101";
        String prodId2 = "C222";
        String prodID = "B205";
        int qty = 2;
        
        CashRegister cr = new CashRegister();
        cr.startNewSale(custID);
        cr.addItemToSale(prodId1, qty);
        cr.addItemToSale(prodID, 5);
        cr.addItemToSale(prodId2, 1);
        cr.finalizeSale();
    }
}
