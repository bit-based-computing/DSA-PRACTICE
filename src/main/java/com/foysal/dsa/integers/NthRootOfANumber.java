package com.foysal.dsa.integers;

public class NthRootOfANumber {

    double nthRootOfANumber(double x, int n) {
        double left = 1.0;
        double right = x;
        while (Math.abs(left- right) > 0.001) {
            double mid = (left + right) / 2.0;
            double mul = multiply(mid, n);
            if(mul > x ){
                right = mid;
            } else if(mul < x ) {
                left = mid;
            }
        }
        return left;
    }
    double multiply(double x, int n) {
        double result = 1.0;
        while (n > 0) {
            result *= x;
            n--;
        }
        return result;
    }
}
