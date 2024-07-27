package com.foysal.dsa.integers;

public class Pow {  // LeetCode 50

    public static double pow(double x, int n) {
        int temp = n;
        if (n < 0) n = n * -1;

        double result = 1.0;
        while (n > 0) {
            if (n % 2 == 0) {
                x = x * x;
                n /= 2;
            } else {
                result *= x;
                n = n - 1;
            }
        }
        if(temp < 0) return (double)1.0/result;
        return result;
    }
}
