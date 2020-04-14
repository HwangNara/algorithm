package leetcode.challenge30day.week1;

import java.util.HashSet;
import java.util.Set;

public class P2 {

  public static void main(String[] args) {
    System.out.println(new P2().isHappy(19));
  }

  public boolean isHappy(int n) {
    Set<Integer> existSet = new HashSet<>();

    while (true) {
      int sum = sum(n);
      if (existSet.contains(sum)) {
        return false;
      }
      if (sum == 1) {
        return true;
      }
      existSet.add(sum);
      n = sum;
    }
  }

  private int sum(int n) {
    int sum = 0;
    while (n > 0) {
      int i = n % 10;
      sum += i * i;
      n /= 10;
    }
    return sum;
  }
}
