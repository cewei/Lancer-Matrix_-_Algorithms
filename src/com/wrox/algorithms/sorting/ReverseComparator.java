/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wrox.algorithms.sorting;

/**
 *
 * @author Lancer-Matrix
 */
public class ReverseComparator implements Comparator{
    private final Comparator _comparator;
    
    public ReverseComparator(Comparator comparator){
        assert comparator != null : "comparator can't be null";
        _comparator = comparator;
    }

    public int compare(Object left, Object right) {
        return _comparator.compare(right, left);
    }
}
