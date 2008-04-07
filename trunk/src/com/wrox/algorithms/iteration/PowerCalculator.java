/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wrox.algorithms.iteration;

/**
 *
 * @author cewei.foo.2006
 */
public final class PowerCalculator {
    public static final PowerCalculator INSTANCE = new PowerCalculator();
    
    private PowerCalculator() {
        
    }
    
    public int calculate(int base, int exponent) {
        assert exponent >= 0 : "exponent can't be < 0";
        
        int result = 1;
        
        for (int i=0; i<exponent; i++) {
            result *= base;
        }
        
        return result;
    }
}
