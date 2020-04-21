package leetcode.problem.p1000;

import java.util.Arrays;

public class P1313 {

  public static void main(String[] args) {
    int[] input = {1, 1, 2, 3};
//    int[] input = {1, 2, 3, 4};
    System.out.println(Arrays.toString(new P1313().decompressRLElist(input)));
  }

  public int[] decompressRLElist(int[] nums) {
    int size = 0;
    for (int i = 0; i < nums.length; i += 2) {
      size += nums[i];
    }
    int[] ans = new int[size];

    int idx = 0;
    int freq = 0;
    for (int i = 0; i < nums.length; i++) {
      if ((i & 1) == 0) {
        freq = nums[i];
        continue;
      }
      for (int j = 0; j < freq; j++) {
        ans[idx++] = nums[i];
      }
    }
    return ans;
  }
}
