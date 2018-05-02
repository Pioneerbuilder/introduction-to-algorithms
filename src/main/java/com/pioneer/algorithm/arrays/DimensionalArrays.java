package com.pioneer.algorithm.arrays;

/**
 * Created by daydayup on 2018/5/2.
 */
public class DimensionalArrays {

    /**
     * 输入n阶横纵递增的二维数组（无重复元素），返回递增的一维数组（包含所有元素），
     * 横向递增速度和纵向递增速度不在一个数量级（可能导致待排序元素线性增加），
     * 请给出时间复杂度较低的做法
     * @param twoDArray
     */
    public double[] twoToOneDArray(double[][] twoDArray) {
        return null;
    }

    public static void main(String[] args) {
        DimensionalArrays arrays = new DimensionalArrays();
        double[][] twoDArray = {{1, 3, 5, 7}, {20, 40, 71, 75}, {25, 45, 73, 76}, {30, 50, 173, 1076}};
        arrays.twoToOneDArray(twoDArray);
    }

}
