package com.foysal.dsa.integers;

public class ReverseInteger {  // LeetCode 7

    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int rev = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;
            if(rev > max/10 || (rev == max/10 && lastDigit > 7)) {
                return 0;
            }
            if(rev < min/10 || (rev == min/10 && lastDigit <8)) {
                return 0;
            }
            rev = rev * 10 + lastDigit;
        }
        return rev;
    }
}
