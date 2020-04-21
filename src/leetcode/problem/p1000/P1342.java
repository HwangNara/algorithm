package leetcode.problem.p1000;

public class P1342 {

  public static void main(String[] args) {
    int input = 14;
    System.out.println(new P1342().numberOfSteps(input)); // 6
  }

  public int numberOfSteps(int num) {
    if (num == 0) {
      return 0;
    }
    return ans(num, 0);
  }

  private int ans(int num, int i) {
    while (true) {
      i++;
      if (num == 1) {
        return i;
      }
      if ((num & 1) == 0) {
        num /= 2;
      } else {
        num -= 1;
      }
    }
  }
}
