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
}
