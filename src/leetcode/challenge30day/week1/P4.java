package leetcode.challenge30day.week1;

import java.util.Arrays;

public class P4 {

  public static void main(String[] args) {
//    int[] input = {1}; // 1
    int[] input = {0, 1, 0, 3, 12}; // 1,3,12,0,0
    new P4().moveZeroes(input);
  }

  public void moveZeroes(int[] nums) {
    int move = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        move++;
        continue;
      }

      nums[i - move] = nums[i];
      if (move != 0) {
        nums[i] = 0;
      }
    }
    System.out.println(Arrays.toString(nums));
  }
}

