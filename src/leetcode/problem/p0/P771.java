package leetcode.problem.p0;

public class P771 {

  public static void main(String[] args) {
    final String J = "aA";
    final String S = "aAAbbbb";

    System.out.println(new P771().numJewelsInStones(J, S));
  }

  public int numJewelsInStones(String J, String S) {
    int ans = 0;
    for (int i = 0; i < J.length(); i++) {
      for (int j = 0; j < S.length(); j++) {
        if (S.charAt(j) == J.charAt(i)) {
          ans++;
        }
      }
    }
    return ans;
  }
}
