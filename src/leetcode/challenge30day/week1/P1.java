package leetcode.challenge30day.week1;

import java.util.HashSet;
import java.util.Set;

public class P1 {

  public static void main(String[] args) {
    int[] input = {4, 1, 2, 1, 2};
    System.out.println(new P1().singleNumber(input));
  }

  public int singleNumber(int[] nums) {
    Set<Integer> result = new HashSet<>();
    for (int num : nums) {
      if (result.contains(num)) {
        result.remove(num);
      } else {
        result.add(num);
      }
    }
    return result.iterator().next();
  }
}

