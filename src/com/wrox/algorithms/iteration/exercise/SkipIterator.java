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
public class SkipIterator implements Iterator {

    private final Iterator _iterator;
    private final int _skip;

    public SkipIterator(Iterator iterator, int skip) {
        assert iterator != null : "iterator can't be null";
        assert skip > 0 : "skip can't be < 1";
        _iterator = iterator;
        _skip = skip;
    }

    public void first() {
        _iterator.first();
        skipForwards();
    }

    public void last() {
        _iterator.last();
        skipBackwards();
    }

    public boolean isDone() {
        return _iterator.isDone();
    }

    public void next() {
        _iterator.next();
        skipForwards();
    }

    public void previous() {
        _iterator.previous();
        skipBackwards();
    }

    public Object current() throws IteratorOutOfBoundsException {
        return _iterator.current();
    }

    public void skipForwards() {
        for (int i = 0; i < _skip && !_iterator.isDone(); _iterator.next()) {
            ;
        }
    }

    public void skipBackwards() {
        for (int i = 0; i < _skip && !_iterator.isDone(); _iterator.next()) {
            ;
        }
    }
}
