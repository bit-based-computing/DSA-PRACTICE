package com.foysal.dsa.strings;

public class ReverseString {    // LeetCode 344

    public void reverse(char[] string) {
        int len = string.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            char temp = string[left];
            string[left] = string[right];
            string[right] = temp;
            left++;
            right--;
        }
    }
}
