import java.util.Arrays;

public class leetcode4 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while(right < nums.length){
            if (nums[right] !=0){
                int tem = nums[right];
                nums[right] = nums[left];
                nums[left] = tem;
                left++;
            }
            right++;
        }
        

    }
}
