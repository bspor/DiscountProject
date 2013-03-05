package bjs.discountstrategy;
/**
 * This class applies a variable rate discount
 * @author bspor
 * @version 1.00
 * @param discountRate this can be set via its setter otherwise it defaults
 * to .15
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
