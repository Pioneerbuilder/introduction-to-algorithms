package com.pioneer.algorithm;

import com.pioneer.algorithm.search.BinarySearch;
import com.pioneer.algorithm.search.SearchAlgorithm;

/**
 * Created by daydayup on 2018/3/31.
 */
public class Main {
    public static void main(String[] args) {
//        Integer[] array = new Integer[15];
//        Random random = new Random(10);
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//            System.out.println(array[i] + ",");
//        }
//
//        System.out.println("start to sort");

//        SortAlgorithm algorithm = SortFactory.create(array, QuickSort.class);
//        if (algorithm == null) {
//            System.out.println("invoke exception occurs");
//            return;
//        }
//        SortAlgorithm algorithm = new QuickSort(array);
//        SortAlgorithm algorithm = new MergeSort(array);

//        algorithm.recursiveSort();

        int[] array0 = {5, 3};

        SearchAlgorithm algorithm = new BinarySearch(array0);

        int index = algorithm.nonRecursiveSearch(3);

        System.out.println(index);
    }
}
