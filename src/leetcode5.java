public class leetcode5 {
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        while(left<right){
            ans = Math.max(ans, (right - left) * Math.min(height[left],height[right]));
            if(height[left] < height[right]) left++;
            else right--;
        }
        return ans;
    }
}
