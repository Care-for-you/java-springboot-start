package com.ds.start.arithmetic.sort;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName BubbleSort
 * @Description 冒泡排序：平均时间复杂度O（n²）最优时间复杂度O（n） 交换排序。稳定
 * <p>比较相邻的元素, 如果第一个比第二个大，就交换他们两个。</p>
 * @Author Ds.Yang
 * @Date 2020/11/18 14:26
 * @Version 1.0
 */
public class BubbleSort {

    public static void sort(Integer[] source) {
        int temp;
        for (int i = 0; i < source.length - 1; i++) {
            for (int j = 0; j < source.length - 1; j++) {
                if (source[j] > source[j + 1]) {
                    temp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = temp;
                }
            }
        }
        List<Integer> list = Arrays.asList(source);
        list.forEach(e -> System.err.print(e + " "));
    }

    public static void sortBetter(Integer[] source) {
        int temp;
        for (int i = 0; i < source.length - 1; i++) {
            // 判断如果内循环一次没有交换数据说明已完全排序
            boolean swap = false;
            for (int j = 0; j < source.length - 1; j++) {
                if (source[j] > source[j + 1]) {
                    temp = source[j + 1];
                    source[j + 1] = source[j];
                    source[j] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        List<Integer> list = Arrays.asList(source);
        list.forEach(e -> System.err.print(e + " "));
    }

    public static void main(String[] args) {
        sort(new Integer[]{5, 8, 0, 3, 1, 2});
        //sortBetter(new Integer[]{5, 8, 0, 3, 1, 2});
    }

}
