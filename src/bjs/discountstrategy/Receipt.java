package bjs.discountstrategy;

/**
 *
 * @author bspor
 */
public class Receipt {
//    private Product product;

    private Customer customer;
//    private int qty;
    LineItem[] lineItems = new LineItem[0];

    public Receipt(String custID) {
        customer = lookupCustomerByID(custID);
    }

    private Customer lookupCustomerByID(String custID) {
//        Customer customer = new Customer(custID);
//        customer.setLastName("Jones");
//        customer.setFirstName("John");
        FakeDataBase db = new FakeDataBase();
        return db.findCustomer(custID);
    }

    //given code
    public void addLineItem(String prodId, int qty) {
        LineItem item = new LineItem(prodId, qty);
        addToArray(item);
    }

    //Used given code.
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    // Here's how to loop through all the line items and get a grand total
    public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for (LineItem item : lineItems) {
            grandTotal += item.getItemPrice();
        }
        return grandTotal;
    }

    public void finalizeSaleAndPrintReceipt() {
        double totalDueGross = 0.00;
        double totalDueNet = 0.00;
        double totalDiscount = 0.00;

        // New way. String builder

        StringBuilder sb = new StringBuilder("Thanks for Shopping With Us\n\n");
        sb.append(customer.getCustName()).append("\n");
        //Loop through each item
        for (LineItem s)
        
       
        sb.append(customer.getCustName()).append("\n");
        sb.append(customer.getCustName()).append("\n");
        sb.append(customer.getCustName()).append("\n");
    }

    public static void main(String[] args) {
        Product product = new Product();
        FakeDataBase fdb = new FakeDataBase();

        product = fdb.findProduct("B205");
        Receipt receipt = new Receipt("100");

        LineItem lineItem = new LineItem("B205", 1);
        receipt.addToArray(lineItem);

        System.out.println(receipt.getTotalBeforeDiscount());
    }
}
