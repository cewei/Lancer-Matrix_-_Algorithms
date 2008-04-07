/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wrox.algorithms.queues;

/**
 *
 * @author cewei.foo.2006
 */
public interface Queue {
    public void enqueue(Object value);
    public Object dequeue() throws EmptyQueueException;
    public void clear();
    public int size();
    public boolean isEmpty();
}
