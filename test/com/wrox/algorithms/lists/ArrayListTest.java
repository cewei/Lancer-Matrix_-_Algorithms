/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wrox.algorithms.lists;

/**
 *
 * @author cewei.foo.2006
 */
public class ArrayListTest extends AbstractListTestCase{
    @Override
    protected List createList() {
        return new ArrayList();
    }
    
    public void testResizeBeyondInitialCapacity(){
        List list = new ArrayList(1);
        
        list.add(VALUE_A);
        list.add(VALUE_B);
        list.add(VALUE_C);
        
        assertEquals(3, list.size());
        
        assertSame(VALUE_A, list.get(0));
        assertSame(VALUE_B, list.get(1));
        assertSame(VALUE_C, list.get(2));
    }
    
    public void testDeleteFromLastElementFromArray(){
        List list = new ArrayList(1);
        
        list.add(new Object());
        
        list.delete(0);
    }
}
