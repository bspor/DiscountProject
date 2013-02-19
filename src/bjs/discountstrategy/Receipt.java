/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bjs.discountstrategy;

/**
 *
 * @author bspor
 */
public class Receipt {
    private Customer customer;

    public Receipt(String custID) {
        customer = lookupCustomerByID(custID);
    }

    private Customer lookupCustomerByID(String custID) {
        //Shortcut - fix later
        Customer customer = new Customer(custID);
        customer.setLastName("Jones");
        customer.setFirstName("John");
        
        return customer;
    }
    
}
