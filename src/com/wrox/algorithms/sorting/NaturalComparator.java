/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wrox.algorithms.sorting;

/**
 *
 * @author Lancer-Matrix
 */
public final class NaturalComparator implements Comparator{
    public static final NaturalComparator INSTANCE = 
            new NaturalComparator();
    
    private NaturalComparator(){
        
    }

    public int compare(Object left, Object right) {
        assert left != null : "left can't be null";
        return ((Comparable) left).compareTo(right);
    }
}
