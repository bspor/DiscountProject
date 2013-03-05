package bjs.discountstrategy;
/**
 *
 * @author bspor
 */
public class Receipt {
    private Customer customer;
    
    LineItem[] lineItems = new LineItem[0];

    public Receipt(String custID) {
        customer = lookupCustomerByID(custID);
    }

    private Customer lookupCustomerByID(String custID) {
        FakeDataBase db = new FakeDataBase();
        return db.findCustomer(custID);
    }

    //Pass in productId and quantity to create a new lineitem and add to my array
    //of items
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
        grandTotal = (double)Math.round(grandTotal * 100) / 100;
        return grandTotal;
    }

    //Loop through all items and get their discounts only
    private double getDiscountTotal() {
        double discountTotal = 0.0;
        for (LineItem item : lineItems) {
            discountTotal += item.getProduct().getDiscount()
                    .getDiscountAmt(item.getItemPrice(), item.getQty());
        }
        discountTotal = (double)Math.round(discountTotal * 100) / 100;
        return discountTotal;
    }
    public void finalizeSaleAndPrintReceipt() {
        int countItems=0;
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
            countItems+=item.getQty();
            //Add the price to get a total
        }
        sb.append("===================================").append("\n");
        sb.append("    Sub Total:").append("\t\t").append("$")
                .append(getTotalBeforeDiscount()).append("\n");
        sb.append("    Discount:").append("\t\t").append("$-")
                .append(getDiscountTotal()).append("\n");
        
        //Calculate total due
        double totalDue;
        totalDue = getTotalBeforeDiscount() - getDiscountTotal();
        sb.append("    Total Due:").append("\t\t").append("$")
                .append(totalDue).append("\n");
        sb.append("    **** $").append(getDiscountTotal()).append(" SAVINGS!")
                .append("****").append("\n");
        sb.append("  Total number of items sold  = ").append(countItems)
                .append("\n");
        System.out.println(sb);
    }
}
