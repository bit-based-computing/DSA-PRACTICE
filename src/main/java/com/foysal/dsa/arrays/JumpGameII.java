package com.foysal.dsa.arrays;

public class JumpGameII {  // LeetCode 45
    public int jump(int[] nums) {
        int len = nums.length;
        int reachable = 0;
        int step = 0;
        int startPoint = 0;
        while (reachable < len - 1) {
            int newReachable = reachable;
            for (int j = startPoint; j < len && j <= reachable; j++) {
                newReachable = Math.max(newReachable, nums[j] + j);
            }
            startPoint = reachable + 1;
            reachable = newReachable;
            step++;
        }
        return step;
    }
}
