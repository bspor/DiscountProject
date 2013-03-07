
package bjs.discountstrategy;

import java.util.Objects;

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
   
    /**
     *
     * @param prodID This is the only property that it needs to be passed to it.
     * all others are queried from a database.
     * @param prodName queried from database to fill the object with this property.
     * @param unitCost queried from database to fill the object with this property.
     * @param discount queried from database to fill the object with this property.
     */
    public Product(String prodID, String prodName, double unitCost, DiscountStrategy discount) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.unitCost = unitCost;
        this.discount = discount;
    }

    /**
     *
     * @return gets the productID
     */
    public String getProdID() {
        return prodID;
    }

    /**
     *
     * @param prodID sets the productID
     */
    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    /**
     *
     * @return product name
     */
    public String getProdName() {
        return prodName;
    }

    /**
     *
     * @param prodName set product name.
     */
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    /**
     *
     * @return get unit cost.
     */
    public double getUnitCost() {
        return unitCost;
    }

    /**
     *
     * @param unitCost set unit cost
     */
    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    /**
     *
     * @return get discount
     */
    public DiscountStrategy getDiscount() {
        return discount;
    }

    /**
     *
     * @param discount  set discount
     */
    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.prodID);
        hash = 23 * hash + Objects.hashCode(this.prodName);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.unitCost) ^ (Double.doubleToLongBits(this.unitCost) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.discount);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (!Objects.equals(this.prodID, other.prodID)) {
            return false;
        }
        if (!Objects.equals(this.prodName, other.prodName)) {
            return false;
        }
        if (Double.doubleToLongBits(this.unitCost) != Double.doubleToLongBits(other.unitCost)) {
            return false;
        }
        if (!Objects.equals(this.discount, other.discount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "prodID=" + prodID + ", prodName=" + prodName + ", unitCost=" + unitCost + ", discount=" + discount + '}';
    }
}
