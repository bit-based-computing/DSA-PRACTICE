package com.foysal.dsa.strings;

public class LengthOfLastWord {  // LeetCode 58
    public int lengthOfLastWord(String s) {
        int len = s.length() - 1;
        int count = 0;
        while(len >= 0 && s.charAt(len) == ' ') len--;
        while(len >= 0 && s.charAt(len) != ' ') {
            count++;
            len--;
        }
        return count;
    }
}
