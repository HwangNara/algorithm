package leetcode.challenge30day.week1;

public class P3 {

  public static void main(String[] args) {
    int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; // 6
//    int[] input = {-1, 4, -9, 1, 2, -1, 1, -3, 1, 2};
//    int[] input = {0, -3, 1, 1}; // 2
//    int[] input = {-1, 0, -2, 2}; // 2
//    int[] input = {-4};
//    int[] input = {-2, 1}; // 1
//    int[] input = {1, 2}; // 3
//    int[] input = {-2, 0, -1};
    System.out.println(new P3().maxSubArray(input));
  }

  public int maxSubArray(int[] nums) {
    int ans = nums[0];
    int temp = nums[0];
    for (int i = 1; i < nums.length; i++) {
      temp = Math.max(nums[i], temp + nums[i]);
      ans = Math.max(ans, temp);
    }
    return ans;
  }
}
