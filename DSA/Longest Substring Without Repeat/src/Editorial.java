import java.util.HashMap;

public class Editorial {
    int longestSubstringWithoutRepeat(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int flag = 1;
                HashMap<Integer, Integer> uniqueCharacterCount = new HashMap<Integer, Integer> ();
                for (int index = i; index <= j; index++) {
                    if (uniqueCharacterCount.get(s.charAt(index) - 'a') != null) {
                        flag = 0;
                        break;
                    }
                    uniqueCharacterCount.put(s.charAt(index) - 'a', 1);
                }
                if (flag == 1) {
                    ans = Math.max (ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
