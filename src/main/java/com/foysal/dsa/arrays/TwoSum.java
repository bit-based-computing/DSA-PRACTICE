package com.foysal.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {  // LeetCode 1
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if(map.containsKey(key)) {
                result[0] = i;
                result[1] = map.get(key);
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
