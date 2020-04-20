package leetcode.challenge30day.week3;

import java.util.Arrays;

public class P3 {

  public static void main(String[] args) {
    char[][] input = {
        {'1', '0', '1', '1', '0', '1'},
        {'1', '0', '0', '1', '0', '1'},
        {'1', '0', '0', '0', '0', '0'},
        {'1', '1', '0', '0', '1', '1'}
    };

//    char[][] input = {
//        {'1', '1', '1', '1', '0'},
//        {'1', '1', '0', '1', '0'},
//        {'1', '1', '0', '0', '0'},
//        {'0', '0', '0', '0', '0'}
//    };

//    char[][] input = {
//        {'1', '1', '1'},
//        {'1', '1', '0'},
//    };

//    char[][] input = {};

    System.out.println(new P3().numIslands(input));
  }

  public int numIslands(char[][] grid) {
    if (grid.length == 0 || grid[0].length == 0) {
      return 0;
    }
    int ans = 0;
    for (int row = 0; row < grid.length; row++) {
      for (int col = 0; col < grid[row].length; col++) {
        if (grid[row][col] == '1') {
          ans++;
          find(row, col, grid);
        }
      }
    }
    return ans;
  }

  private void find(int row, int col, char[][] grid) {
    if (row < 0
        || row >= grid.length
        || col < 0
        || col >= grid[row].length
        || grid[row][col] == '0') {
      return;
    }
    grid[row][col] = '0';
    find(row - 1, col, grid);
    find(row + 1, col, grid);
    find(row, col - 1, grid);
    find(row, col + 1, grid);
  }
}
