/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wrox.algorithms.iteration.exercise;

import junit.framework.TestCase;
import com.wrox.algorithms.iteration.*;

/**
 *
 * @author cewei.foo.2006
 */
public class SkipIteratorTest extends TestCase {

    private static final Object[] ARRAY = {"A", "B", "C", "D", "E", "F"};

    public void testSkipForward() {
        Iterator expectedIterator = new ArrayIterator(ARRAY);
        Iterator underlyingIterator = new ArrayIterator(new Object[]{"A", "C", "E"});

        Iterator iterator = new SkipIterator(expectedIterator, 2);

        iterator.first();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[0], iterator.current());
    }
}
