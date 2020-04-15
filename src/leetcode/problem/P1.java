package leetcode.problem;

import java.util.Arrays;

public class P1 {

  public static void main(String[] args) {
    int[] input = {2, 7, 11, 15};
    int target = 26;
    System.out.println(Arrays.toString(new P1().twoSum(input, target)));
  }

  public int[] twoSum(int[] nums, int target) {
    int[] ans = new int[2];
    for (int i = 0; i < nums.length - 1; i++) {
      int fix = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        if (target - fix == nums[j]) {
          return new int[]{i, j};
        }
      }
    }
    return ans;
  }
}
