import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode6 {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        int left, right;
        while(i <= nums.length-3){
            left = i+1;
            right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left+1] == nums[left]) left++;
                    while(left<right && nums[right-1] == nums[right]) right--;
                    left++;
                    right--;
                }
                if (sum<0) left++;
                if(sum>0) right--;
            }
            i++;
            while (i<nums.length && nums[i-1] == nums[i]) i++;
        }
        return ans;

    }
}
