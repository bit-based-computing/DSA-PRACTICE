import java.util.HashMap;

public class Editorial {
    int longestSubstringWithoutRepeat(String s) {
        int n = s.length();
        int longestSubstring = 0;
        int[] previousIndex = new int[26];
        for (int i = 0; i < 26; i++) {
            previousIndex[i] = - 1;
        }
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (previousIndex[s.charAt(i) - 'a'] >= start) {
                start = previousIndex[s.charAt(i) - 'a'] + 1;
            }
            previousIndex[s.charAt(i) - 'a'] = i;
            longestSubstring = Math.max(longestSubstring, i - start + 1);
        }
        return longestSubstring;
    }
}
