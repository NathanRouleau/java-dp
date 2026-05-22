package org.sebsy.strategy;

import org.junit.Assert;
import org.junit.Test;

public class StrategyTest {

    private Tri tri = new Tri();
    private int[] tableauAttendu = {1, 2, 3, 5, 8, 9};

    @Test
    public void testBubbleSort() {
        int[] tableau = {5, 3, 8, 1, 9, 2};
        tri.exec(TypeTri.BUBBLE_SORT, tableau);
        Assert.assertArrayEquals(tableauAttendu, tableau);
    }

    @Test
    public void testInsertionSort() {
        int[] tableau = {5, 3, 8, 1, 9, 2};
        tri.exec(TypeTri.INSERTION_SORT, tableau);
        Assert.assertArrayEquals(tableauAttendu, tableau);
    }

    @Test
    public void testSelectionSort() {
        int[] tableau = {5, 3, 8, 1, 9, 2};
        tri.exec(TypeTri.SELECTION_SORT, tableau);
        Assert.assertArrayEquals(tableauAttendu, tableau);
    }
}