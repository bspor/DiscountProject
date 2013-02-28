package bjs.discountstrategy;
/**
 *
 * @author bspor
 */
public class CashRegister {
//    private String prodId;
//    private String custId;
//    private int qty;
    private Receipt receipt;

//    public CashRegister(String prodId, String custId, int qty) {
//        
//        this.prodId = prodId;
//        this.custId = custId;
//        this.qty = qty;
//    }
       
    public CashRegister() {
    }

    public void startNewSale(String custID) {
        receipt = new Receipt(custID);
    }

    public void addItemToSale(String prodID, int qty) {
        receipt.addLineItem(prodID, qty);
    }   

    public void finalizeSale() {
        toString();
    }
}
