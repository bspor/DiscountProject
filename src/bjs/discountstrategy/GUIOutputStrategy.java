/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bjs.discountstrategy;

import javax.swing.JOptionPane;

/**
 * GUI Output class
 * @author bspor
 */
public class GUIOutputStrategy implements OutputStrategy {

    /** 
     * My output class 
     * @param outPut The string to be output to the GUI
     */
    @Override
    public void outPut(String outPut) {
         JOptionPane.showMessageDialog(null, outPut);
    }
}
