package org.sebsy.strategy;

public class Tri {

    public void exec(TypeTri typeTri, int[] tableau) {
        // demande au factory quelle stratégie utiliser
        Strategy strategy = StrategyFactory.getStrategy(typeTri);

        if (strategy != null) {
            strategy.trier(tableau);
        }
    }
}