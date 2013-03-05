package bjs.discountstrategy;
/**
 * This is applied to products that implement quantity discounts 
 *
 * @author bspor
 * @version 1.00
 * @param  discountRate  this can be set with a setter, its default is 15
 * @param minQty this is the minimum quantity needed for a discount to be applied
 * minQty defaults at 5
 */
public class QtyDiscount implements DiscountStrategy {
    private double discountRate = .15;
    private int minQty = 5;

    /**
     * Determines if a product qualifies for a quantity discount
     * @param rate discount percent as decimal.
     * @param qty how many of an item needed to qualify for discount
     */
    public QtyDiscount(double rate, int qty) {
        discountRate = rate;
        this.minQty = minQty;
    }

    /**
     *
     * @param unitCost How much does the unit cost before discounts.
     * @param qty how many of an item needed to qualify for discount
     * @return returns the discount amount for the product, if there is one.
     */
    @Override
    public double getDiscountAmt(double unitCost, int qty) {
        if (qty >= minQty) {
            return unitCost * qty * discountRate;
        } else {
            return 0;
        }
    }

    /**
     *
     * @return get discount rate.
     */
    public double getDiscountRate() {
        return discountRate;
    }

    /**
     *
     * @param discountRate set discount rate
     */
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
