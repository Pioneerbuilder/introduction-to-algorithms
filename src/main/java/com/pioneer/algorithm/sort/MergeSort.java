package com.pioneer.algorithm.sort;

/**
 * Created by daydayup on 2018/4/1.
 */
public class MergeSort implements SortAlgorithm {

    private Integer[] array;

    private Integer[] tempArr;

    public MergeSort(Integer[] array) {
        this.array = array;
        tempArr = new Integer[array.length];
    }

//    @PostConstruct
//    private void init() {
//        tempArr = new Integer[array.length];
//    }

    @Override
    public void recursiveSort() {
        mergeSort(0, array.length - 1);
    }

    @Override
    public void nonRecursiveSort() {
        throw new RuntimeException("not support");
    }

    private void mergeSort(int left, int right) {
        if (left >= right) return;

        int center = (left + right) >> 1;

        mergeSort(left, center);

        mergeSort(center + 1, right);

        merge(left, center, right);

    }

    private void merge(int left, int center, int right) {
        int i = left, j = center + 1;

        for (int k = left; k <= right; k++) {
            if (i > center) {
                tempArr[k] = array[j++];
            } else if (j > right) {
                tempArr[k] = array[i++];
            } else if (array[i] <= array[j]) {
                tempArr[k] = array[i++];
            } else {
                tempArr[k] = array[j++];
            }
        }

        System.arraycopy(tempArr, left, array, left, right + 1 - left);
//        for (int k = left; k <= right; k++) {
//            array[k] = tempArr[k];
//        }
    }

}
