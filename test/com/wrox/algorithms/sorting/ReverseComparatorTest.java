/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wrox.algorithms.sorting;

import junit.framework.TestCase;

/**
 *
 * @author Lancer-Matrix
 */
public class ReverseComparatorTest extends TestCase{
    public void testLessThanBecomesGreaterThan(){
        ReverseComparator comparator = 
                new ReverseComparator(NaturalComparator.INSTANCE);
        
        assertTrue(comparator.compare("A", "B") > 0);
    }
    
    public void testGreaterthanBecomesLessThan(){
        ReverseComparator comparator = 
                new ReverseComparator(NaturalComparator.INSTANCE);
        
        assertTrue(comparator.compare("B", "A") < 0);
    }
    
    public void testEqualsRemainsUnchanged(){
        ReverseComparator comparator = 
                new ReverseComparator(NaturalComparator.INSTANCE);
        
        assertTrue(comparator.compare("A", "A") == 0);
    }
}
