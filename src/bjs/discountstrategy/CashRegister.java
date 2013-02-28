package bjs.discountstrategy;
/**
 *
 * @author bspor
 */
public class CashRegister {
    private Receipt receipt;
    
    public CashRegister() {
    }

    public void startNewSale(String custID) {
        receipt = new Receipt(custID);
    }

    public void addItemToSale(String prodID, int qty) {
        receipt.addLineItem(prodID, qty);
    }   

    public void finalizeSale() {
        receipt.finalizeSaleAndPrintReceipt();
    }
}
