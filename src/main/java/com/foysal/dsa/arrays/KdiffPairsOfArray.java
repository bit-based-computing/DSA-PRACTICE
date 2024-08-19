package com.foysal.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairsOfArray { // LeetCode 532

    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        if (k == 0) {
            for(Integer value : map.values()) {
                if (value > 1) count++;
            }
        } else {
            for (Integer key: map.keySet()) {
                if (map.containsKey(key - k)) count++;
            }
        }
        return count;
    }
}
