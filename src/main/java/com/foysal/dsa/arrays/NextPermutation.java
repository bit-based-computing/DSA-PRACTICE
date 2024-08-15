package com.foysal.dsa.arrays;

public class NextPermutation {  // LeetCode 31
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = len - 1;
            while(j > i && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        int l = i + 1;
        int r = len - 1;
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
