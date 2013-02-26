package bjs.discountstrategy;
/**
 *
 * @author bspor
 */
public class Receipt {
    private Product product;
    private Customer customer;
    private int qty;
    LineItem [] lineItems = new LineItem[0];

    public Receipt(String custID) {
        customer = lookupCustomerByID(custID);
    }
    private Customer lookupCustomerByID(String custID) {
        //Shortcut - fix later
        Customer customer = new Customer(custID);
        customer.setLastName("Jones");
        customer.setFirstName("John");
        
        return customer;
    }
    // Here's how Receipt class adds a purchased product as a LineItem
    // Note that the Receipt must have a LineItem[]  lineItems array property
    //given code
    public void addLineItem(String prodId, int qty) {
        LineItem item = new LineItem(prodId, qty);
        addToArray(item);
    }

	// Since arrays are fixed in size, to add a new element you must resize
	// the array, but wait, you can't do that in Java! Well, you can fake it. Here's how:
	// Create a new temporary array that's one larger than the original. Then,
	// copy all the data from the original into the temporary array.
	// Finally, add the new item to the new element in the temporary array. Then,
	// set the original = temporary. That's it!
    //given code
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

	// Here's how to loop through all the line items and get a grand total
    public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for(LineItem item : lineItems) {
            grandTotal += item.getItemPrice();
        }
        return grandTotal;
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
