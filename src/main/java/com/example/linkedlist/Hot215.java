package com.example.linkedlist;

import java.util.PriorityQueue;

/**
 * @author goldensoup3
 * @create 2025-08-07 17:24
 *
 * 数组第 k 大元素
 */
public class Hot215 {

    public Integer findKthLargest(int[] nums, int k) {

        if (nums.length < k) {
            return -1;
        }

        // PriorityQueue 默认是小顶堆
        // 如果需要大顶堆，使用 new PriorityQueue<>(k, (a, b) -> b - a);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                minHeap.add(nums[i]);
            } else {
                if (nums[i] > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.add(nums[i]);
                }
            }
        }
        return minHeap.peek();
    }
}
