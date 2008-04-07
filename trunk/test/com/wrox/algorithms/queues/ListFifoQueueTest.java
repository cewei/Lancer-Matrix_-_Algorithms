/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wrox.algorithms.queues;

/**
 *
 * @author cewei.foo.2006
 */
public class ListFifoQueueTest extends AbstractFifoQueueTestCase{
    @Override
    protected Queue createFifoQueue() {
        return new ListFifoQueue();
    }
    
}
