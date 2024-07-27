package com.foysal.dsa.strings;

public class LongestPalindromicSubstring {  // LeetCode 5

    // using dynamic programming
    // TC: O(n^2), SC: O(n^2)
    public int longestPalindromeDP(String s) {
        if (s == null || s.length() == 0) return 0;
        int maxLen = 1;
        int len = s.length();
        int[][] dp = new int[len][len];

        for (int i = 0; i < s.length(); i++) dp[i][i] = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                maxLen = 2;
            }
        }

        boolean found = true;
        int plen = 2;

        while (found) {
            plen++;
            found = false;
            for (int left = 0; left < len - plen; left++) {
                int right = left + plen - 1;
                if (s.charAt(left) == s.charAt(right) && dp[left + 1][right - 1] == 1) {
                    dp[left][right] = 1;
                    maxLen = plen;
                    found = true;
                }
            }
        }
        return maxLen;
    }



    // using expand from center technic
    // TC: O(n^2), SC: O(1)

    int start = 0, end = 0;
    public String longestPalindrome(String s) {
        start = 0;
        end = 0;
        if (s == null || s.length() == 0) return "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            expand(s, i ,i);
            expand(s, i, i+1);
        }
        return s.substring(start, end);
    }
    public void expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        left = left + 1;
        right = right - 1;
        if(end - start + 1 < right - left + 1) {
            start = left;
            end = right;
        }
    }
}
