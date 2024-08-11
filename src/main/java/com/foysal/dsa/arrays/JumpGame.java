package com.foysal.dsa.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGame {  // LeetCode - 55
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int reachable = 0;
        for (int i = 0; i < len && i <= reachable; i++) {
            reachable = Math.max(reachable, i + nums[i]);
            if(reachable >= len - 1) return true;
        }
        return false;
    }
}
