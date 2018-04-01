package com.pioneer.algorithm.search;

/**
 * Created by daydayup on 2018/4/1.
 */
public class BinarySearch implements SearchAlgorithm {

    private int[] array;

    public BinarySearch(int[] array) {
        this.array = array;
    }

    @Override
    public int nonRecursiveSearch(int number) {
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int index = (start + end) >> 1;
            if (end - start == 1) {
                if (array[index = start] == number || array[index = end] == number) {
                    return index;
                }
            }

            if (array[index] == number) {
                return index;
            } else if (array[index] > number) {
                end = index - 1;
            } else {
                start = index + 1;
            }
        }
        throw new RuntimeException("no number in the array has been found");
    }

    @Override
    public int recursiveSearch(int number) {
        int index = 0;
        return index;
    }

    @Override
    public void outPut(int[] array) {

    }
}
