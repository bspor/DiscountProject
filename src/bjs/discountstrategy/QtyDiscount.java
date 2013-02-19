/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bjs.discountstrategy;

/**
 *
 * @author bspor
 */
public class QtyDiscount implements DiscountStrategy {
    private double discountRate = .15;
    private int minQty = 5;

    public QtyDiscount(double rate, int qty) {
        discountRate = rate;
        this.minQty = minQty;
    }

    @Override
    public double getDiscountAmt(double unitCost, int qty) {
        if (qty >= minQty) {
            return unitCost * qty * discountRate;
        } else {
            return 0;
        }
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
