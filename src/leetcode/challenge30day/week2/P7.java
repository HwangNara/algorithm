package leetcode.challenge30day.week2;

public class P7 {

  public static void main(String[] args) {
//    String input = "abcdefg"; // efgabcd
//    int[][] shift = {{1, 1}, {1, 1}, {0, 2}, {1, 3}};
    String input = "yisxjwry";
    int[][] shift = {{1,8},{1,4},{1,3},{1,6},{0,6},{1,4},{0,2},{0,1}};
    System.out.println(new P7().stringShift(input, shift));
  }

  public String stringShift(String s, int[][] shift) {
    int leftAmount = 0;
    for (int[] row : shift) {
      int direction = row[0];
      int amount = row[1];
      leftAmount += direction == 0 ? amount : -amount;
    }
    leftAmount %= s.length();
    leftAmount = leftAmount < 0 ? s.length() + leftAmount : leftAmount;
    return s.substring(leftAmount) + s.substring(0, leftAmount);
  }
}
