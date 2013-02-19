
package bjs.discountstrategy;

public interface DiscountStrategy {
    public abstract double getDiscountAmt(double unitCost, int qty);
}
