import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 和为K的子数组
 */
public class leetcode10 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(subarraySum(nums,3));
    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix = 0;
        int ans = 0;
        for (int i=0; i<nums.length; i++){
            prefix += nums[i];
            if (map.containsKey(prefix - k)){
                ans += map.get(prefix - k);
            }
            map.put(prefix, map.getOrDefault(prefix , 0)+1);
        }
        return ans;
    }
}
