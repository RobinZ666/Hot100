import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class leetcode3 {
    public static void main(String[] args) {
        int[] nums = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        for(int num: nums){
            hash.add(num);
        }
        int ans = 0;
        for (int num : hash){
            int count = 1;
            int tem = num;
            if(hash.contains(tem-1)) continue;
            while(hash.contains(tem+1)){
                count++;
                tem++;
            }
            ans = Math.max(ans, count);
        }
        return ans;
    }
}
