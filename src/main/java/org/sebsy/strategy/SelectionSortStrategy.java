package org.sebsy.strategy;

public class SelectionSortStrategy implements Strategy {

    @Override
    public void trier(int[] tableau) {
        int n = tableau.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < n; j++) {
                if (tableau[j] < tableau[indiceMin]) {
                    indiceMin = j;
                }
            }
            int temp = tableau[indiceMin];
            tableau[indiceMin] = tableau[i];
            tableau[i] = temp;
        }
    }
}