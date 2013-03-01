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

    // Loop through all items to get a total. There is no applied discount.
    private double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for (LineItem item : lineItems) {
            grandTotal += item.getItemPrice();
        }
        return grandTotal;
    }

    private double getDiscountTotal() {
        double discountTotal = 0.0;
        for (LineItem item : lineItems) {
            discountTotal += item.getItemPrice();
        }
        return discountTotal;
    }
    public void finalizeSaleAndPrintReceipt() {
        double totalDueGross = 0.00;
        double totalDueNet = 0.00;
        double totalDiscount = 0.00;

        StringBuilder sb = new StringBuilder("Thanks for Shopping With Us\n");
        sb.append(customer.getCustName()).append("\n\n");
        sb.append("#   Description").append("\t\tPrice").append("\n");
        sb.append("===================================").append("\n");
        //Loop through each item
        for (LineItem item : lineItems) {
            //Create my string
            sb.append(item.getQty()).append("   ")
                    .append(item.getItemName()).append("\t$")
                    .append(item.getItemPrice()).append("\n");
            
            //Add the price to get a total
        }
        sb.append("===================================").append("\n");
        sb.append("    Sub Total:").append("\t\t").append("$")
                .append(getTotalBeforeDiscount()).append("\n");
        sb.append("     Discount:").append("\t\t").append("$")
                .append(getTotalBeforeDiscount()).append("\n");
        System.out.println(sb);
    }
}
