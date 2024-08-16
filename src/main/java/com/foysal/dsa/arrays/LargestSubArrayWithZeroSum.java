package com.foysal.dsa.arrays;

import java.util.HashMap;

public class LargestSubArrayWithZeroSum {  //
    public int findLargestSubarray(int[] arr) {
        int len = arr.length;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
            if(sum == 0) {
                maxLen = i + 1;
            } else if (map.containsKey(sum)) {
                if(i - map.get(sum) > maxLen) {
                    maxLen = i -  map.get(sum);
                }
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

}
