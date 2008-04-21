/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wrox.algorithms.sorting;

/**
 *
 * @author Lancer-Matrix
 */
public class BubblesortListSorterTest extends AbstractListSorterTest{

    @Override
    protected ListSorter createListSorter(Comparator comparator) {
        return new BubblesortListSorter(comparator);
    }
}
