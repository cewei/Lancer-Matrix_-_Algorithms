/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wrox.algorithms.stacks;

/**
 *
 * @author Lancer-Matrix
 */
public class ListStackTest extends AbstractStackTestCase{

    @Override
    protected Stack createStack() {
        return new ListStack();
    }
    
}
