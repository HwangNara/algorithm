package leetcode.challenge30day.week3;

public class P2 {

  private static final Character L = '(';
  private static final Character R = ')';
  private static final Character AST = '*';
  private static final int DEFAULT = 0;

  public static void main(String[] args) {
    String input = "(*)"; // true
    System.out.println(new P2().checkValidString(input));
  }

  public boolean checkValidString(String s) {
    int lo = 0;
    int hi = 0;
    for (char c : s.toCharArray()) {
      lo += c == '(' ? 1 : -1;
      hi += c != ')' ? 1 : -1;
      if (hi < 0) {
        break;
      }
      lo = Math.max(lo, 0);
    }
    return lo == 0;
  }
}
