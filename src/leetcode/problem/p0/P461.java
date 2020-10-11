package leetcode.problem.p0;

public class P461 {

  public static void main(String[] args) {
    System.out.println(new P461().hammingDistance(1, Integer.MAX_VALUE));
    System.out.println(new P461().hammingDistance(1, 4));
  }

  public int hammingDistance(int x, int y) {
    String s1 = padding(Integer.toBinaryString(x));
    String s2 = padding(Integer.toBinaryString(y));
    int length = s1.length();
    int count = 0;
    for (int i = 0; i < length; i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        count++;
      }
    }
    return count;
  }

  private String padding(String binaryString) {
    StringBuilder result = new StringBuilder(binaryString);
    while (result.length() < 31) {
      result.insert(0, 0);
    }
    return result.toString();
  }
}
