import java.util.HashMap;
import java.util.Map;

//Own solution
public class Main {
    int longestSubstringWithoutRepeat(String s) {
        // add your logic here
        int ans = 0;
        int maxAns = 0;
        int lastUpdateIndex = -1;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i < s.length(); i++){
            char a = s.charAt(i);
            int prevIndex = map.getOrDefault(a, -1);
            if(prevIndex == -1 || lastUpdateIndex > prevIndex){
                ans++;
            } else{
                maxAns = Math.max(ans, maxAns);
                ans = i - prevIndex;
                lastUpdateIndex = prevIndex + 1;
            }
            map.put(a, i);
        }
        maxAns = Math.max(ans, maxAns);
        return maxAns;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
