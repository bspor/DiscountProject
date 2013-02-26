package bjs.discountstrategy;
/**
 *
 * @author bspor
 */
public class Receipt {
    private Product product;
    private Customer customer;
    private int qty;

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
    public void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item);
    }

	// Since arrays are fixed in size, to add a new element you must resize
	// the array, but wait, you can't do that in Java! Well, you can fake it. Here's how:
	// Create a new temporary array that's one larger than the original. Then,
	// copy all the data from the original into the temporary array.
	// Finally, add the new item to the new element in the temporary array. Then,
	// set the original = temporary. That's it!
    private void addToArray(LineItem item) {
        LineItem[] lineItems = new LineItem();
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

	// Here's how to loop through all the line items and get a grand total
    public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for(LineItem item : lineItems) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        return grandTotal;
    }
}
