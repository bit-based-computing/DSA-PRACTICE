package com.foysal.dsa.integers;

public class FactorialTrailingZeros {   // LeetCode 172

    public int trailingZeros(int n) {
        int result = 0;
        while (n > 0) {
            result += n / 5;
            n /= 5;
        }
        return result;
    }
}
