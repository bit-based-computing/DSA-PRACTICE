package com.foysal.dsa.integers;

public class SingleNumber {  // LeetCode 136

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
