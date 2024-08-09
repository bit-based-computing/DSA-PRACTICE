package com.foysal.dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {  // LeetCode 217
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) return true;
            map.put(num, 1);
        }
        return false;
    }
}
