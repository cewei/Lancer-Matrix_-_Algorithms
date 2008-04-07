/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wrox.algorithms.iteration;

/**
 *
 * @author cewei.foo.2006
 */
public interface Iterator {
    public void first();
    
    public void last();
    
    public boolean isDone();
    
    public void next();
    
    public void previous();
    
    public Object current() throws IteratorOutOfBoundsException;
}
