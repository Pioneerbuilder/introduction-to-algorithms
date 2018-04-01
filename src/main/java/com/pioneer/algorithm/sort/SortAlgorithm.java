package com.pioneer.algorithm.sort;

import java.util.Random;

/**
 * SortAlgorithm
 * Created by daydayup on 2018/3/31.
 */
public interface SortAlgorithm {

    default int[] initArray() {
        int[] array = new int[15];
        Random random = new Random(10);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.println(array[i] + ",");
        }
        System.out.println("start to sort");
        return array;
    }

    void recursiveSort();

    void nonRecursiveSort();

    default void outPutResult(int[] array) {
        System.out.println("the result by quick sort is:");
        for (int i : array) {
            System.out.println(i + ",");
        }
    }
}
