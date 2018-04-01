package com.pioneer.algorithm;

import com.pioneer.algorithm.sort.QuickSort;
import com.pioneer.algorithm.sort.SortAlgorithm;

/**
 * Main
 * Created by daydayup on 2018/3/31.
 */
public class Main {
    public static void main(String[] args) {

        int[] array = new QuickSort(new int[0]).initArray();
        SortAlgorithm algorithm = new QuickSort(array);
//        SortAlgorithm algorithm = new MergeSort(array);

        algorithm.recursiveSort();
        algorithm.outPutResult(array);

//        int[] array0 = {5, 3, 12, 54, 12 , 65, 43, 23, 13};
//
//        SearchAlgorithm algorithm = new BinarySearch(array0);
//
//        int index = algorithm.nonRecursiveSearch(12);

//        System.out.println(index);
    }
}
