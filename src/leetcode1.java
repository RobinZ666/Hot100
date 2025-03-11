import java.util.Arrays;
import java.util.HashMap;

public class leetcode1 {
    public static void main(String[] args) {
        int[] cin = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(twoSum(cin, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            if (map.containsKey(find))
                return new int[]{i, map.get(find)};
            else map.put(nums[i], i);
        }
        return new int[]{0};
    }
}
