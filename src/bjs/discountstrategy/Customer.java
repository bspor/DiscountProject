package bjs.discountstrategy;

/**
 * Customer Class
 * @author bspor
 */
public class Customer {
    private String custID, custName;

    /**
     * Creates a customer object
     * @param custID  every customer has this property which is past to it by Receipt
     * @param custName every customer has this property which is past to it
     * by database query
     */
    public Customer(String custID, String custName) {
        this.custID = custID;
        this.custName = custName;
    }

    /**
     *
     * @return customer ID.
     */
    public String getCustID() {
        return custID;
    }

    /**
     *
     * @param custID sets the customer ID.
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     *
     * @return get the customer name.
     */
    public String getCustName() {
        return custName;
    }

    /**
     *
     * @param custName set the customer name
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }
}
