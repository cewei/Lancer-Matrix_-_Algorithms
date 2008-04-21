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
public class NaturalComparatorTest extends TestCase{
    public void testLessThan(){
        assertTrue(NaturalComparator.INSTANCE.compare("A", "B") < 0);
    }
    
    public void testGreaterThan(){
        assertTrue(NaturalComparator.INSTANCE.compare("B", "A") > 0);
    }
    
    public void testEqualTo(){
        assertTrue(NaturalComparator.INSTANCE.compare("A", "A") == 0);
    }
}
