package com.foysal.dsa.arrays;

public class RemoveDuplicatesFromSortedArrayII {  // LeetCode 80
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count = 1;
        int k = 0;
        for (int i = 1; i < len; i++) {
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
                count = 1;
            } else if(count == 1) {
                nums[++k] = nums[i];
                count = 2;
            }
        }
        return k+1;
    }
}
