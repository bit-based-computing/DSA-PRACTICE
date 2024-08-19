package com.foysal.dsa.arrays;

public class JumpGameIII { // LeetCode 1306

    public boolean canReach(int[] arr, int start) {
        if (start < 0 || start >= arr.length || arr[start] < 0) return false;
        if (arr[start] == 0) return true;
        int val = arr[start];
        arr[start] = -arr[start];
        return canReach(arr, start + val) || canReach(arr, start - val);
    }
}
