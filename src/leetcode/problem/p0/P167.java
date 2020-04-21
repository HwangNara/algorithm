package leetcode.problem.p0;

import java.util.Arrays;

public class P167 {

  public static void main(String[] args) {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;
    System.out.println(Arrays.toString(new P167().twoSum(numbers, target))); // [1, 2]
  }

  public int[] twoSum(int[] numbers, int target) {
    int length = numbers.length;
    label:
    for (int i = 0; i < length; i++) {
      int fix = numbers[i];
      for (int j = i + 1; j < length; j++) {
        if (fix + numbers[j] == target) {
          return new int[]{i + 1, j + 1};
        }
        if (fix + numbers[j] > target) {
          continue label;
        }
      }
    }
    return null;
  }
}
