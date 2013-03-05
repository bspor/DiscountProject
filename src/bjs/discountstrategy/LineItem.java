package bjs.discountstrategy;
/**
 * This class creates a product in order to query it from a fake data base. It
 * also needs to be passed the quantity.
 *
 * @author bspor
 * @version 1.00
 */
public class LineItem extends Product {
    private Product product;
    private int qty;

    /**
     * This is the line item used in the Receipt.
     * @param prodId used to pass to the product. 
     * @param qty provides the number of items.
     */
    public LineItem(String prodId, int qty) {
        FakeDataBase fdb = new FakeDataBase();
        product = fdb.findProduct(prodId);
        this.qty = qty;
    }

    /**
     * Default constructor.
     */
    public LineItem() {
    }

    /**
     * Returns the product that was queried.
     *
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the product
     * @param product needed to set the product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * This method gets the quantity of line items.
     *
     * @return a line item quantity.
     */
    public int getQty() {
        return qty;
    }

    /**
     * 
     * @return returns the unit cost of a product
     */
    public double getItemPrice() {
        return product.getUnitCost();
    }
    
    /**
     * 
     * @return Returns a string containing the name of the product.
     */
    public String getItemName () {
        return product.getProdName();
    }
 
    /**
     *
     * @param qty needed to set how many of a product
     */
    public void setQty(int qty) {
        this.qty = qty;
    }
}
