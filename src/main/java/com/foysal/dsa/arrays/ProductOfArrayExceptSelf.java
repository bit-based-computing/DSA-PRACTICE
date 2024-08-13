package com.foysal.dsa.arrays;

public class ProductOfArrayExceptSelf {  // LeetCode 238
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        int left = 1;
        for (int i = 0; i < len; i++) {
            result[i] = left;
            left *= nums[i];
        }
        int right = 1;
        for (int i = len - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}
