package com.practise;

/**
 * Created by pkama on 9/18/2016.
 */
public class SortingUtil {

    private SortingStrategy _sortingStrategy;

    public SortingUtil(SortingStrategy sortingStrategy_) {
        _sortingStrategy=sortingStrategy_;
    }

    public void sort(int array[]) {
    _sortingStrategy.sort(array);
    }

}
