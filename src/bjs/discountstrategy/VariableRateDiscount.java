package bjs.discountstrategy;
/**
 *
 * @author bspor
 */
public class VariableRateDiscount implements DiscountStrategy {
    private double discountRate = .15;

    public VariableRateDiscount(double rate) {
        discountRate = rate;
    }

    @Override
    public double getDiscountAmt(double unitCost, int qty) {
        return unitCost * qty * discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
