package leetcode.challenge30day.week3;

public class P4 {

  public static void main(String[] args) {
    int[][] input = {
        {1, 3, 1},
        {1, 5, 1},
        {4, 2, 1}};
    System.out.println(new P4().minPathSum(input));
  }

  public int minPathSum(int[][] grid) {
    int rows = grid.length;
    int cols = grid[0].length;
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        if (row == 0 && col == 0) {
          continue;
        } else if (row == 0) {
          grid[0][col] += grid[0][col - 1];
        } else if (col == 0) {
          grid[row][0] += grid[row - 1][0];
        } else {
          grid[row][col] = Math.min(grid[row - 1][col], grid[row][col - 1]) + grid[row][col];
        }
      }
    }
    return grid[rows - 1][cols - 1];
  }
}
