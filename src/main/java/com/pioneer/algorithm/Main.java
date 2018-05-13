package com.pioneer.algorithm;

import com.pioneer.algorithm.sort.HeapSort;
import com.pioneer.algorithm.sort.SortAlgorithm;

/**
 * Main
 * Created by daydayup on 2018/3/31.
 */
public class Main {
    public static void main(String[] args) {

        int[] array = new HeapSort(new int[0]).initArray();
        SortAlgorithm algorithm = new HeapSort(array);
//        SortAlgorithm algorithm = new MergeSort(array);

        algorithm.nonRecursiveSort();
        algorithm.outPutResult(array);

//        int[] array0 = {1, 3, 5};
//
//        SearchAlgorithm algorithm = new BinarySearch(array0);
//
//        int index = algorithm.nonRecursiveSearch(4);
//
//        System.out.println(index);
    }
}
