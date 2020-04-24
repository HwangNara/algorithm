package leetcode.challenge30day.week4;

public class P2 {

  public static void main(String[] args) {
//    int m = 5;
//    int n = 7;
    int m = 2147483646;
    int n = 2147483647;
    System.out.println(new P2().rangeBitwiseAnd(m, n)); // 4
  }

  public int rangeBitwiseAnd(int m, int n) {
    int shift = 0;
    while (m < n) {
      m >>= 1;
      n >>= 1;
      shift++;
    }
    return m << shift;
  }
}
