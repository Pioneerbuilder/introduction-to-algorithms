package com.pioneer.algorithm.sort;

/**
 * QuickSort
 * Created by daydayup on 2018/3/31.
 */
public class QuickSort implements SortAlgorithm {

    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    @Override
    public void recursiveSort() {
        sort(0, array.length - 1);
    }

    @Override
    public void nonRecursiveSort() {
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int index = partition(start, end);
        }
    }


    /**
     * 递归实现，当切分的子数组总是偏向一方，即数组有序，达到最坏时间复杂度，O(n^2)
     * @param start 开始节点
     * @param end 末尾节点
     */
    private void sort(int start, int end) {
        if (start >= end) {
            return;
        }
        int index = partition(start, end);
        sort(start, index - 1);
        sort(index + 1, end);
    }

    private int partition(int start, int end) {
        int i = start, j = end + 1;
        int symbol = array[start];
        while (true) {
            while (symbol < array[--j]) if (j == start) break;

            while (symbol > array[++i]) if (i == end) break;

            if (i >= j) break;

            swap(i, j);
        }
        swap(j, start);
        return j;
    }

    private void swap(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
