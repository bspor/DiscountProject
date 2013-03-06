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
    //All discounts will need a quantity even if it doesnt matter
    private int qty;
    /**
     *
     * @param rate this is needed to determine what the discount rate will be.
     * Used as decimal.
     */
    public VariableRateDiscount(double rate) {
        discountRate = rate;
    }

    /**
     * This method will get the amount discounted as a dollar amount.
     * @param unitCost how much the unit costs before any applied discounts.
     * @param qty how many units.
     * @return
     */
    @Override
    public double getDiscountAmt(double unitCost, int qty) {
        return unitCost * qty * discountRate;
    }

    /**
     *
     * @return  gets the discount rate.
     */
    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    /**
     *
     * @param discountRate  sets the discount rate.
     */ 
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public int getQty() {
        return qty;
    }
}
