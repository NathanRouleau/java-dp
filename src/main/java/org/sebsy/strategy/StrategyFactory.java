package org.sebsy.strategy;

public class StrategyFactory {

    public static Strategy getStrategy(TypeTri type) {
        switch (type) {
            case BUBBLE_SORT:
                return new BubbleSortStrategy();
            case INSERTION_SORT:
                return new InsertionSortStrategy();
            case SELECTION_SORT:
                return new SelectionSortStrategy();
            default:
                return null;
        }
    }
}