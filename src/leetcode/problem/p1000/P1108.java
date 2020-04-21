package leetcode.problem.p1000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1108 {

  private static final Pattern COMPILE = Pattern.compile(".", Pattern.LITERAL);

  public static void main(String[] args) {
    String input = "1.1.1.1";
    System.out.println(new P1108().defangIPaddr(input));
  }

  public String defangIPaddr(String address) {
    return COMPILE.matcher(address).replaceAll(Matcher.quoteReplacement("[.]"));
  }
}
