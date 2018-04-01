package com.pioneer.algorithm.search;

/**
 * Created by daydayup on 2018/4/1.
 */
public interface SearchAlgorithm {

    int nonRecursiveSearch(int number);

    int recursiveSearch(int number);

    default void outPut(int[] array) {
        System.out.println("output result of search");
    }
}
