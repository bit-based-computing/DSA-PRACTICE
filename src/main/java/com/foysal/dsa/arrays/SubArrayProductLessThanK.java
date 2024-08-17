package com.foysal.dsa.arrays;

public class SubArrayProductLessThanK { // LeetCode 713

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int l = 0;
        int count = 0;
        int sum = 1;
        for(int i = 0; i < nums.length; i++) {
            sum = sum * nums[i];
            while(l <= i && sum >= k) {
                sum /= nums[l];
                l++;
            }
            count = count + (i - l + 1);

        }
        return count;
    }

}
