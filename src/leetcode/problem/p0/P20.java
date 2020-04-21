package leetcode.problem.p0;

import java.util.Stack;

public class P20 {

  public static void main(String[] args) {
    String input = "[";
//    String input = "()[]{}}";
    System.out.println(new P20().isValid(input)); // true
  }

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    int length = s.length();

    for (int i = 0; i < length; i++) {
      char c = s.charAt(i);
      switch (c) {
        case '(':
          stack.push(')');
          break;
        case '{':
          stack.push('}');
          break;
        case '[':
          stack.push(']');
          break;
        case ')':
        case '}':
        case ']':
          if (stack.isEmpty() || stack.pop() != c) {
            return false;
          }
          break;
      }
    }
    return stack.isEmpty();
  }
}
