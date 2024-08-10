package com.foysal.dsa.arrays;

public class RotateArray {  // LeetCode 189
    public  void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        reverse(0, len - k - 1, nums);
        reverse(len - k, len -1, nums);
        reverse(0, len - 1, nums);

    }
    private void reverse(int left, int right, int[] nums) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
