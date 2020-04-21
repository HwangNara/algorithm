package leetcode.problem.p0;

public class P9 {

  public static void main(String[] args) {
//    int input = -121; // false
    int input = 10; // false
//    int input = 121; // true
    System.out.println(new P9().isPalindrome(input));
  }

  public boolean isPalindrome(int x) {
    String origin = String.valueOf(x);
    return origin.equalsIgnoreCase(new StringBuilder(origin).reverse().toString());
  }
}
