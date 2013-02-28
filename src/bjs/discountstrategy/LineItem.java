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
//    String prodId;
    private int qty;

    public LineItem(String prodId, int qty) {
        FakeDataBase fdb = new FakeDataBase();
        product = fdb.findProduct(prodId);
        this.qty = qty;
    }

    public LineItem() {
    }

    /**
     * Returns the product that was queried.
     *
     */
    public Product getProduct() {
        return product;
    }

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
    
    public void setQty(int qty) {
        this.qty = qty;
    }

    public static void main(String[] args) {
        Product product = new Product();
        FakeDataBase fdb = new FakeDataBase();

        product = fdb.findProduct("B205");
        LineItem lineItem = new LineItem("B205", 2);

        System.out.println(lineItem.product.getProdName());
    }
}
