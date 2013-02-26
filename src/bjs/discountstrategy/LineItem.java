package bjs.discountstrategy;
/**
 *
 * @author bspor
 */
public class LineItem extends Product {
    private Product product;
    String prodId;
    private int qty;

    public LineItem(String prodId, int qty) {
        FakeDataBase fdb = new FakeDataBase();
        product = fdb.findProduct(prodId);
        this.qty = qty;
    }

    public LineItem() {
        
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }
    
    public double getItemPrice() {
        return product.getUnitCost();
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
