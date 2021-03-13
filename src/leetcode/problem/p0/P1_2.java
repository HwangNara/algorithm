package leetcode.problem.p0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P1_2 {

  public static void main(String[] args) {
//    int[] input = {3, 2, 95, 4, -3};
//    int[] input = {3, 2, 4};
//    int[] input = {2, 7, 11, 15};
    int[] input = {-10, 7, 19, 15};
//    int target = 92;
//    int target = 6;
//    int target = 26;
    int target = 9;
    System.out.println(Arrays.toString(new P1_2().twoSum(input, target)));
  }

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      Integer otherIndex = map.get(target - nums[i]);
      if (otherIndex != null) {
        return new int[]{otherIndex, i};
      }
      map.put(nums[i], i);
    }
    return new int[2];
  }
}
