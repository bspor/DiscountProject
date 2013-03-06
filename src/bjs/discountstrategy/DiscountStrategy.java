
package bjs.discountstrategy;

public interface DiscountStrategy {
    public abstract double getDiscountAmt(double unitCost, int qty);
    public abstract double getDiscountRate();
    
    //This was added to show how many were required to get discount
    public abstract int getQty();
}
