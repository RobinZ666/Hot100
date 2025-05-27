public class leetcode13 {
    /**
     * 最大子数组和
     * 我刚开始的想法（关联到之前的经验）：
     * 1.试试用滑动窗口： 固定左端，遍历右边所有可能， O(n*n),不可信
     * 2.前缀和： 对于某个位置的最大值，也要遍历前面所有的前缀和，O(n*n),也不可行
     * 最终解法： 动态规划（虚伪的动态规划）
     */
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int i=0; i<nums.length; i++){
            if (sum >= 0){
                sum += nums[i];
            }else{
                sum = nums[i];
            }
            ans = Math.max(ans, sum);

        }
        return ans;
    }
}
