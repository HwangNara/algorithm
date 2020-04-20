package leetcode.challenge30day.week2;

import java.util.HashMap;
import java.util.Map;

public class P6 {

  public static void main(String[] args) {
    int[] input = {0, 1};
    System.out.println(new P6().findMaxLength(input));
  }

  public int findMaxLength(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    int maxlen = 0, count = 0;
    for (int i = 0; i < nums.length; i++) {
      count += nums[i] == 1 ? 1 : -1;
      if (map.containsKey(count)) {
        maxlen = Math.max(maxlen, i - map.get(count));
      } else {
        map.put(count, i);
      }
    }
    return maxlen;
  }
}
