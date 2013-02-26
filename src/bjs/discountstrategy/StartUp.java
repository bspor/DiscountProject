
package bjs.discountstrategy;

public class StartUp {
    public static void main(String[] args) {
        String custID = "100";
        String prodID = "C222";
        int qty = 2;
        
        CashRegister cr = new CashRegister();
        cr.startNewSale(custID);
        cr.addItemToSale(prodID, qty);
        cr.addItemToSale(prodID, 1);
        cr.finalizeSale();
    }
}
