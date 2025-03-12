import java.util.*;

public class leetcode9 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        System.out.println(findAnagrams(s,"abc"));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int[] window = new int[26];
        int[] ans = new int[26];
        if(p.length() > s.length()) return new ArrayList<>();
        List<Integer> indexs = new ArrayList<>();
        for (int i=0; i<p.length(); i++){
            ans[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }
        int left = 0;
        int right = p.length() - 1;
        while(right < s.length()){
            if (Arrays.equals(window, ans)){
                indexs.add(left);
            }
            window[s.charAt(left) - 'a']--;
            left++;
            right++;
            if (right >= s.length() ) break;
            window[s.charAt(right) - 'a']++;
        }
        return indexs;
    }
}
