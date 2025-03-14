import java.util.*;

public class leetcode11 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();
        int left = 1-k;
        int right = 0;
        List<Integer> ans = new ArrayList<>();
        while(right < nums.length){
            if (left>0 && queue.getFirst().equals(nums[left-1])){
                queue.removeFirst();
            }
            while(!queue.isEmpty() && nums[right] > queue.peekLast()){
                queue.removeLast();
            }
            queue.addLast(nums[right]);
            if (left >=0) ans.add(queue.getFirst());

            right++;
            left++;
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
