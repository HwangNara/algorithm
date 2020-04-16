package leetcode.challenge30day.week3;

public class P2 {

  public static void main(String[] args) {
    String input = "(*)"; // true
    System.out.println(new P2().checkValidString(input));
  }

  public boolean checkValidString(String s) {
    if (s.charAt(0) == ')') {
      return false;
    }

    int length = s.length();
    int wildCardCount = 0;
    for (int i = 0; i < length; i++) {

    }
    return true;
  }
}
