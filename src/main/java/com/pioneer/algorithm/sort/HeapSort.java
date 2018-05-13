package com.pioneer.algorithm.sort;

/**
 * HeapSort
 * Created by daydayup on 2018/4/1.
 */
public class HeapSort implements SortAlgorithm {

    private int[] array;

    public HeapSort(int[] array) {
        this.array = array;
    }

    @Override
    public void recursiveSort() {

    }

    @Override
    public void nonRecursiveSort() {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            adjustHeap(i, array.length);
        }
        for (int i = array.length - 1; i > 0; i--) {
            swap(0, i);
            adjustHeap(0, i);
        }
    }

    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * 从顶层下沉至底部
     * @param parent
     * @param bottom
     */
    private void adjustHeap(int parent, int bottom) {
        int child;
        int temp;
        for (temp = array[parent]; 2 * parent + 1 < bottom; parent = child) {
            child = 2 * parent + 1;
            if (child + 1 < bottom && array[child] < array[child + 1]) {
                child++;
            }
            if (temp < array[child]) {
                array[parent] = array[child];
            } else {
                break;
            }
        }
        array[parent] = temp;
    }
}
