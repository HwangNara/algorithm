package leetcode.challenge30day.week1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P7 {

  public static void main(String[] args) {
//    int[] input = {1, 1, 2, 2}; // 2
    int[] input = {1, 3, 2, 3, 5, 0}; // 3
//    int[] input = {1, 2, 3}; // 2
//    int[] input = {1, 1, 3, 3, 5, 5, 7, 7}; // 0
    System.out.println(new P7().countElements(input));
  }

  public int countElements(int[] arr) {
    int ans = 0;
    Set<Integer> set = new HashSet<>();
    Arrays.stream(arr).forEach(set::add);

    for (int n : arr) {
      if (set.contains(n + 1)) {
        ans++;
      }
    }
    return ans;
  }
}
