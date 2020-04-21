package leetcode.problem.p0;

import java.util.Arrays;

public class P942 {

  public static void main(String[] args) {
//    String input = "IID";
    String input = "IDID";
//    String input = "DDI";
//    String input = "III";
//    String input = "DDD";
//    String input = "DDDD";
//    String input = "IDDD";
    System.out.println(Arrays.toString(new P942().diStringMatch(input)));
  }

  public int[] diStringMatch(String S) {
    int N = S.length();
    int lo = 0;
    int hi = N;
    int[] ans = new int[N + 1];
    for (int i = 0; i < N; ++i) {
      if (S.charAt(i) == 'I') {
        ans[i] = lo++;
      } else {
        ans[i] = hi--;
      }
    }
    ans[N] = lo;
    return ans;
  }

//  public int[] diStringMatch(String S) {
//    int[] ans = new int[S.length() + 1];
//    int length = ans.length;
//
//    ans[0] = 0;
//    int min = ans[0];
//    for (int i = 1; i < length; i++) {
//      ans[i] = ans[i - 1] + (S.charAt(i - 1) == 'I' ? 1 : -1);
//      min = Math.min(min, ans[i]);
//    }
//
//    for (int i = 0; i < length; i++) {
//      ans[i] -= min;
//    }
//    return ans;
//  }
}

/**
 * IDID - x, x+1, x, x+1, x : x=0~3
 * IIII - x, x+1, x+2, x+3, x+4 : x=0
 * IIID - x, x+1, x+2, x+3, x+2 : x=0~1
 * IDDD - x, x+1, x, x-1, x-2 : x=2~3
 * DIII - x, x-1, x, x+1, x+2 : x=1~2
 * DDDD - x, x-1, x-2, x-3, x-4 : x=4
 */
