package leetcode.challenge30day.week3;

import java.util.Arrays;

public class P1 {

  public static void main(String[] args) {
    int[] input = {0, 0}; // {0, 0}
//    int[] input = {1, 0, 3}; // {0, 3, 0}
//    int[] input = {1, 2, 3, 4};
    System.out.println(Arrays.toString(new P1().productExceptSelf(input)));
  }

  public int[] productExceptSelf(int[] nums) {
    int length = nums.length;
    int[] ans = new int[length];
    int[] leftProd = new int[length];
    int[] rightProd = new int[length];

    int zeroCount = 0;
    for (int n : nums) {
      if (n == 0) {
        zeroCount++;
      }
      if (zeroCount >= 2) {
        return ans;
      }
    }

    leftProd[0] = 1;
    for (int i = 1; i < length; i++) {
      leftProd[i] = leftProd[i - 1] * nums[i - 1];
    }
    rightProd[length - 1] = 1;
    for (int i = length - 2; i >= 0; i--) {
      rightProd[i] = rightProd[i + 1] * nums[i + 1];
    }
    for (int i = 0; i < length; i++) {
      ans[i] = leftProd[i] * rightProd[i];
    }
    return ans;
  }
}
