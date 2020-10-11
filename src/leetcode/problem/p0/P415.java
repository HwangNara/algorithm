package leetcode.problem.p0;

public class P415 {

  public static void main(String[] args) {
    System.out.println(new P415().addStrings("1", "3000"));
    System.out.println(new P415().addStrings("1", "9"));
  }

  public String addStrings(String num1, String num2) {
    StringBuilder result = new StringBuilder();
    num1 = reverse(num1);
    num2 = reverse(num2);
    int maxLength = Math.max(num1.length(), num2.length());

    int carry = 0;
    for (int i = 0; i < maxLength; i++) {
      int int1 = i <= num1.length() - 1 ? num1.charAt(i) - '0' : 0;
      int int2 = i <= num2.length() - 1 ? num2.charAt(i) - '0' : 0;

      int sum = int1 + int2 + carry;
      if (sum >= 10) {
        carry = 1;
        sum -= 10;
      } else {
        carry = 0;
      }
      result.append(sum);
    }
    if (carry == 1) {
      result.append(1);
    }
    return result.reverse().toString();
  }

  private String reverse(String num) {
    return new StringBuilder(num).reverse().toString();
  }
}
