package com.example.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author goldensoup3
 * @create 2025-08-07 15:54
 *
 * 快速排序
 */
public class QuickSort {

    public void sort(int[] nums) {
        shuffle(nums);
        sort(nums, 0, nums.length - 1);
    }

    private void sort(int[] nums, int l, int h) {
        if (h <= l) {
            return;
        }
        int pivot = partition(nums, l, h);
        sort(nums, l, pivot - 1);
        sort(nums, pivot + 1, h);
    }

    private int partition(int[] nums, int l, int h) {
        int i = l;
        int j = h + 1;
        int v = nums[l];
        while (i < j) {
            while ((nums[++i] < v) && (i != h));
            while ((nums[j--] > v) && (j != l));
            swap(nums, i, j);
        }
        // 最后一次循环时，i和j交换了位置，i在j的右边了，所以下面的swap是用j
        swap(nums, l, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void shuffle(int[] nums) {
        // 将 int[] 转换为 List，使用 Collections.shuffle 方法来打乱顺序
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        nums = list.stream().mapToInt(Integer::intValue).toArray();
    }
}
