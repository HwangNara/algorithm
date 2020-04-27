package leetcode.challenge30day.week4;

public class P6 {

  public static void main(String[] args) {
//    char[][] matrix = {
//        {'0', '0', '0', '1'},
//        {'1', '1', '0', '1'},
//        {'1', '1', '1', '1'},
//        {'0', '1', '1', '1'},
//        {'0', '1', '1', '1'}};
    char[][] matrix = {
        {'1', '0', '1', '0', '0'},
        {'1', '0', '1', '1', '1'},
        {'1', '1', '1', '1', '1'},
        {'1', '0', '0', '1', '0'}};
//    char[][] matrix = {{'1'}};
//    char[][] matrix = {
//        {'0', '1'},
//        {'1', '0'}
//    };
    System.out.println(new P6().maximalSquare(matrix));
  }

  public int maximalSquare(char[][] matrix) {
    if (matrix.length == 0 || matrix[0].length == 0) {
      return 0;
    }
    int ans = 0;
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] dp = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
      dp[i][0] = matrix[i][0] - '0';
      if (dp[i][0] == 1) {
        ans = 1;
      }
    }
    for (int i = 0; i < cols; i++) {
      dp[0][i] = matrix[0][i] - '0';
      if (dp[0][i] == 1) {
        ans = 1;
      }
    }
    for (int row = 1; row < rows; row++) {
      for (int col = 1; col < cols; col++) {
        if (matrix[row][col] == '1') {
          dp[row][col] = 1 + Math.min(Math.min(
              dp[row][col - 1],
              dp[row - 1][col]),
              dp[row - 1][col - 1]);
          ans = Math.max(ans, dp[row][col]);
        }
      }
    }
    return ans * ans;
  }
}
