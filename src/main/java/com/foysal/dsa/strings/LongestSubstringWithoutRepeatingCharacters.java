package com.foysal.dsa.strings;

public class LongestSubstringWithoutRepeatingCharacters {   // LeetCode 3
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int [] indexes = new int [26];
        for (int i = 0; i < 26; i++) indexes[i] = -1;
        int left = 0;
        int ans = 1;
        for (int right = 1; right < s.length(); right++) {
            left = Math.max(left, indexes[s.charAt(right) - 'a'] + 1);
            indexes[s.charAt(right) - 'a'] = right;
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
