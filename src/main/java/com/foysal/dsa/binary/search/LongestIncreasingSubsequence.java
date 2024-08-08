package com.foysal.dsa.binary.search;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {  // LeetCode 300

    public int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.isEmpty() || num > list.get(list.size() - 1)) {
                list.add(num);
            } else {
                int lowerIndex = lowerBound(list, num);
                list.set(lowerIndex, num);
            }
        }
        return list.size();
    }

    private int lowerBound(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        int index = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid) >= target) {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }
}
