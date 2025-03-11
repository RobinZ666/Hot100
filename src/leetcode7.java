public class leetcode7 {
    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
        System.out.println(222);
    }
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int ans = 0;
        int pre = 0, suf = 0;  //前缀最大、后缀最大
        while(left < right){
            pre = Math.max(height[left], pre);
            suf = Math.max(height[right], suf);
            if(pre < suf){
                ans += pre - height[left];
                left++;
            }else{
                ans += suf - height[right];
                right--;
            }
        }
        return ans;
    }
}
