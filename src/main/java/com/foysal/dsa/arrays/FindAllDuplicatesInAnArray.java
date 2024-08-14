package com.foysal.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {  // LeetCode 442

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] appears = new int[nums.length + 1];
        int len = nums.length;

        for (int i = 0; i < len; i++){
            if(appears[nums[i]]++ == 1) ans.add(nums[i]);
        }

        return ans;
    }

    // another way memory efficient
    public List<Integer> findDuplicates2(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            int index = Math.abs(nums[i]);
            if(nums[index-1] < 0){
                ans.add(index);
            } else {
                nums[index - 1] = -nums[index - 1];
            }
        }

        return ans;
    }
}
