package leetcode.problem.p0;

public class P7 {

  public static void main(String[] args) {
//    int input = -321; // -123
//    int input = 123; // 321
    int input = 1534236469; // 321
//    int input = 120; // 21
    System.out.println(new P7().reverse(input));
  }

  public int reverse(int x) {
    int ans = 0;
    long ans2 = 0;
    boolean minus = x < 0;
    x = Math.abs(x);

    while (x > 0) {
      ans *= 10;
      ans2 *= 10;
      int n = x % 10;
      x /= 10;
      if (ans == 0 && n == 0) {
        continue;
      }
      ans += n;
      ans2 += n;
    }
    if (ans != ans2) {
      return 0;
    }
    return minus ? -ans : ans;
  }
}
