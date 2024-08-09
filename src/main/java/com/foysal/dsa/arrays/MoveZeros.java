package com.foysal.dsa.arrays;

public class MoveZeros {  // LeetCode 283
    public  void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        int len = nums.length;
        while(right < len){
            if(nums[right] != 0){
                nums[left++] = nums[right];
            }
            right++;
        }
        while(left < len){
            nums[left++] = 0;
        }
    }
}
