package com.foysal.dsa.arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {   // LeetCode 239
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] result = new int[len - k + 1];
        Deque<Integer> deque = new ArrayDeque<Integer>();
        for (int i = 0; i < len; i++) {
            while (deque.size() > 0 && deque.peekFirst() < i- k + 1) deque.pollFirst();
            while (deque.size() > 0 && nums[deque.peekLast()] < nums[i]) deque.pollLast();
            deque.offerLast(i);
            if (i-k+1>=0) result[i-k+1] = nums[deque.peekFirst()];
        }
        return result;
    }
}
