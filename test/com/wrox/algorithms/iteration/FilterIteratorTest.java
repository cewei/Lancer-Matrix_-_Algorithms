/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wrox.algorithms.iteration;

import junit.framework.TestCase;

/**
 *
 * @author cewei.foo.2006
 */
public class FilterIteratorTest extends TestCase {

    private static final Object[] ARRAY = {"A", "B", "C"};

    private static final class DummyPredicate implements Predicate {

        private final Iterator _iterator;
        private final boolean _result;

        public DummyPredicate(boolean result, Iterator iterator) {
            _iterator = iterator;
            _result = result;
            _iterator.first();
        }

        public boolean evaluate(Object object) {
            assertSame(_iterator.current(), object);
            _iterator.next();
            return _result;
        }
    }

    public void testForwardsIterationIncludesItemsWhenPredicateReturnsTrue() {
        Iterator expectedIterator = new ArrayIterator(ARRAY);
        Iterator underlyingIterator = new ArrayIterator(ARRAY);

        Iterator iterator = new FilterIterator(underlyingIterator,
                new DummyPredicate(true, expectedIterator));

        iterator.first();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[0], iterator.current());

        iterator.next();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[1], iterator.current());

        iterator.next();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[2], iterator.current());

        iterator.next();
        assertTrue(iterator.isDone());
        try {
            iterator.current();
            fail();
        } catch (IteratorOutOfBoundsException e) {
        //expected
        }

        assertTrue(expectedIterator.isDone());
        assertTrue(underlyingIterator.isDone());
    }

    public void testForwardsIterationExcludesItemsWhenPredicateReturnFalse() {
        Iterator expectedIterator = new ArrayIterator(ARRAY);
        Iterator underlyingIterator = new ArrayIterator(ARRAY);

        Iterator iterator = new FilterIterator(underlyingIterator,
                new DummyPredicate(false, expectedIterator));

        iterator.first();
        assertTrue(iterator.isDone());
        try {
            iterator.current();
            fail();
        } catch (IteratorOutOfBoundsException e) {
        //expected
        }

        assertTrue(expectedIterator.isDone());
        assertTrue(underlyingIterator.isDone());
    }
    
    public void testBackwardsIterationIncludesItemsWhenPredicateReturnsTrue(){
        Iterator expectedIterator = new ReverseIterator(new ArrayIterator(ARRAY));
        Iterator underlyingIterator = new ArrayIterator(ARRAY);
        
        Iterator iterator = new FilterIterator(underlyingIterator,
                new DummyPredicate(true, expectedIterator));
        
        iterator.last();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[2], iterator.current());
        
        iterator.previous();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[1], iterator.current());
        
        iterator.previous();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[0], iterator.current());
        
        iterator.previous();
        assertTrue(iterator.isDone());
        try{
            iterator.current();
            fail();
        }   catch(IteratorOutOfBoundsException e){
            //expected
        }
        
        assertTrue(expectedIterator.isDone());
        assertTrue(underlyingIterator.isDone());
    }
    
    public void testBackwardsIterationExcludesItemsWhenPredicateReturnsFalse(){
        Iterator expectedIterator = new ReverseIterator(new ArrayIterator(ARRAY));
        Iterator underlyingIterator = new ArrayIterator(ARRAY);
        
        Iterator iterator = new FilterIterator(underlyingIterator,
                new DummyPredicate(false, expectedIterator));
        
        iterator.last();
        assertTrue(iterator.isDone());
        try{
            iterator.current();
            fail();
        }   catch(IteratorOutOfBoundsException e){
            //expected
        }
        
        assertTrue(expectedIterator.isDone());
        assertTrue(underlyingIterator.isDone());
    }
}
