
package bjs.discountstrategy;

public class StartUp {
    public static void main(String[] args) {
        String custID = "123";
        String prodID = "A101";
        int qty = 2;
        
        CashRegister cr = new CashRegister();
        cr.startNewSale(custID);
        cr.addItemToSale(prodID, qty);
        cr.addItemToSale("B230", 1);
        cr.finalizeSale();
    }
}
