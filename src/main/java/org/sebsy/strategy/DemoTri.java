package org.sebsy.strategy;

import java.util.Arrays;

public class DemoTri {

    public static void main(String[] args) {
        Tri tri = new Tri();

        int[] tableau1 = {5, 3, 8, 1, 9, 2};
        tri.exec(TypeTri.BUBBLE_SORT, tableau1);
        System.out.println("Bubble sort :    " + Arrays.toString(tableau1));

        int[] tableau2 = {5, 3, 8, 1, 9, 2};
        tri.exec(TypeTri.INSERTION_SORT, tableau2);
        System.out.println("Insertion sort : " + Arrays.toString(tableau2));

        int[] tableau3 = {5, 3, 8, 1, 9, 2};
        tri.exec(TypeTri.SELECTION_SORT, tableau3);
        System.out.println("Selection sort : " + Arrays.toString(tableau3));
    }
}