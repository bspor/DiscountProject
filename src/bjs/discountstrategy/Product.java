
package bjs.discountstrategy;

/**
 * This is my product class. 
 *
 * @author bspor
 * @version 1.00
 * @param prodID  This is needed for the product to query the database
 * @param others  All other parameters are filled in from the FakeDataBase
 */
public class Product {
    private String prodID, prodName;
    private double unitCost;
    private DiscountStrategy discount;

 public Product() {
 }
   
    public Product(String prodID, String prodName, double unitCost, DiscountStrategy discount) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.unitCost = unitCost;
        this.discount = discount;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
}
