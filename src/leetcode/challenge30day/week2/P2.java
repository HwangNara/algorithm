package leetcode.challenge30day.week2;

public class P2 {

  public static void main(String[] args) {
    String s = "ab#c";
    String t = "ad#c";
//    String s = "a#c";
//    String t = "b";
//    String s = "ab##";
//    String t = "c#d#";

    System.out.println(new P2().backspaceCompare(s, t));
  }

  public boolean backspaceCompare(String S, String T) {
    return apply(S).equals(apply(T));
  }

  private String apply(String str) {
    char[] chars = str.toCharArray();
    int length = chars.length;
    int shopCount = 0;
    for (int i = length - 1; i >= 0; i--) {
      char c = chars[i];
      if (c == '#') {
        shopCount++;
        chars[i] = ' ';
      } else if (shopCount > 0) {
        chars[i] = ' ';
        shopCount--;
      }
    }
    return new String(chars).replace(" ", "");
  }
}
