import java.util.HashSet;
import java.util.Set;

public class leetcode8 {
    public static void main(String[] args) {
        String s = "aadbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int ans = 0;
        while(right<s.length()){
            if(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(s.charAt(right));
                right++;
            }
            ans = Math.max(ans, right-left);
        }
        return ans;
    }
}
