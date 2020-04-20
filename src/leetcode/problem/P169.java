package leetcode.problem;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P169 {

  public static void main(String[] args) {
    int[] input = {2, 2, 1, 1, 1, 2, 2};
//    int[] input = {3, 3, 4};
//    int[] input = {2, 2, 1, 1, 1, 2, 2};
    System.out.println(new P169().majorityElement(input)); // 2
  }

  public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int n : nums) {
      map.merge(n, 1, (oldVal, newVal) -> oldVal + 1);
    }
    int maxKey = -1;
    int maxVal = -1;
    for (Entry<Integer, Integer> entry : map.entrySet()) {
      if (maxVal < entry.getValue()) {
        maxKey = entry.getKey();
        maxVal = entry.getValue();
      }
    }
    return maxKey;
  }
}
