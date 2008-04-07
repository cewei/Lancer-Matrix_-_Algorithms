/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wrox.algorithms.iteration.exercise;

import com.wrox.algorithms.iteration.*;

/**
 *
 * @author cewei.foo.2006
 */
public final class AndPredicate implements Predicate{
    private final Predicate _left;
    private final Predicate _right;

    public AndPredicate(Predicate left, Predicate right) {
        assert left != null : "left can't be null";
        assert right != null : "right can't be null";
        
        _left = left;
        _right = right;
    }

    public boolean evaluate(Object object) {
        return _left.evaluate(object) && _right.evaluate(object);
    }
    
    
    
    
}
