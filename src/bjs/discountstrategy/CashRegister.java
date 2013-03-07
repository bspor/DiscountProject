package bjs.discountstrategy;
/**
 *
 * @author bspor
 */
public class CashRegister {
    private Receipt receipt;
    
    /**
     * Default constructor
     */
    public CashRegister() {
    }

    /**
     * This method starts a new sale
     * @param custID The customer Id is needed so it can pass it to Receipt
     */
    public void startNewSale(String custID) {
        receipt = new Receipt(custID);
    }

    /**
     * This method adds items to the sale
     * @param prodID this is needed for the lineItem to create the product  
     * @param qty  How many of the product
     */
    public void addItemToSale(String prodID, int qty) {
        receipt.addLineItem(prodID, qty);
    }   

    /**
     *  This method simply calls the finalizeSaleAndPrintReceipt method in Receipt
     */
    public void finalizeSale() {
        OutputStrategy out = new GUIOutputStrategy();
        OutputStrategy out2 = new ConsoleOutputStrategy();
        //InputStrategy in = new InputStrategy();
        
        IOService service = new IOService(receipt.finalizeSaleAndPrintReceipt(), out);
        service.outPut();
        
        //receipt.finalizeSaleAndPrintReceipt();
    }
}
