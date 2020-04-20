package leetcode.challenge30day.week3;

public class P5 {

  private static final int UP = 1;
  private static final int DOWN = 2;

  public static void main(String[] args) {
//    int[] input = {1, 2, 3, 4, 5, 6, 7};
//    int[] input = {};
//    int[] input = {0, 1, 2, 3, 4, 5, 6, 7};
    int[] input = {4, 5, 6, 7, 0, 1, 2};
//    int[] input = {1, 3, 5};
//    int[] input = {4, 5, 6, 7, 0, 1, 2};
    int target = 0;
    System.out.println(new P5().search(input, target)); // 4
  }

  public int search(int[] nums, int target) {
    int l = 0;
    int r = nums.length - 1;

    while (l <= r) {
      int mid = (l + r) >> 1;
      System.out.println(mid);

      if (nums[mid] == target) {
        return mid;
      }
      if (nums[mid] > target) {
        if (nums[r] < nums[mid] && target <= nums[r]) {
          l = mid + 1;
        } else {
          r = mid - 1;
        }
      } else {
        if (nums[mid] < nums[l] && target >= nums[l]) {
          r = mid - 1;
        } else {
          l = mid + 1;
        }
      }
    }
    return -1;
  }
}
