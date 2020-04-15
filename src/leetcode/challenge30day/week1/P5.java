package leetcode.challenge30day.week1;

public class P5 {

  public static void main(String[] args) {
//    int[] input = {7, 6, 4, 3, 1}; // 0
//    int[] input = {2, 1, 2, 0, 1}; // 2
//    int[] input = {1, 2, 3, 4, 5}; // 4
    int[] input = {7, 1, 5, 3, 6, 4}; // 7
    System.out.println(new P5().maxProfit(input));
  }

  public int maxProfit(int[] prices) {
    /**
     * 사기
     *   curr < next
     *
     * 팔기
     *   next < curr || 오늘이 마지막날
     */
    int ans = 0;
    int stock = -1;
    for (int i = 0; i < prices.length - 1; i++) {
      if (stock == -1) {
        if (prices[i] < prices[i + 1]) {
          stock = prices[i];
        }
      } else {
        if (prices[i + 1] < prices[i]) {
          ans += (prices[i] - stock);
          stock = -1;
        }
      }
    }
    if (stock != -1) {
      ans += (prices[prices.length - 1] - stock);
    }
    return ans;
  }
}
