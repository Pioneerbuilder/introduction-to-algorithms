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
    public int nonRecursiveSearch(int target) {
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int index = (start + end) >> 1;
            if (array[index] == target) {
                return index;
            } else if (array[index] > target) {
                end = index - 1;
            } else {
                start = index + 1;
            }
        }
        return -1;
    }

    @Override
    public int recursiveSearch(int target) {
        int start = 0, end = array.length - 1;
        if (start <= end) {
            int index = (start + end) >> 1;
            if (array[index] > target) {
                search(target, start, index - 1);
            } else if (array[index] < target) {
                search(target, index + 1, end);
            } else {
                return index;
            }
        }
        return -1;
    }

    private void search(int target, int start, int end) {

    }

    @Override
    public void outPut(int[] array) {

    }
}
