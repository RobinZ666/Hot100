import sun.text.normalizer.UCharacter;

import java.util.HashMap;
import java.util.Map;

public class leetcode12 {
    /**
     * 最小覆盖字串
     * https://leetcode.cn/problems/minimum-window-substring/description/?envType=study-plan-v2&envId=top-100-liked
     */
    public static void main(String[] args) {
        leetcode12 l = new leetcode12();
        System.out.println(l.minWindow("ADOBECODEBANC", "ABC"));
    }
    public String minWindow(String s, String t) {
        int[] target = new int[128];
        int[] window = new int[128];

        for (int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            target[c]++;
        }
        int left = 0;
        int right = 0;
        String ans  = "";
        while(right < s.length()){
            char c = s.charAt(right);
            if (target[c] >0)
                window[c]++;
            while (right - left +1 >= t.length() && this.check(window, target)){
                while(target[s.charAt(left)]<=0){
                    left++;
                }
                ans = right-left+1 < ans.length() || ans.isEmpty() ? s.substring(left,right+1) : ans;
                window[s.charAt(left)]--;
                left++;
            }
            right++;
        }
        return ans;
    }
    public  boolean check(int[] window, int[] target){
        for (int i=0; i<target.length; i++){
            if (window[i] < target[i])
                return false;
        }
        return true;
    }
}
