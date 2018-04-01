package com.pioneer.algorithm.sort;

/**
 * Created by daydayup on 2018/3/31.
 */
public interface SortAlgorithm {

    void recursiveSort();

    void nonRecursiveSort();

    default void outPutResult(Integer[] array) {
        System.out.println("the result by quick sort is:");
        for (int i : array) {
            System.out.println(i + ",");
        }
    }
}
