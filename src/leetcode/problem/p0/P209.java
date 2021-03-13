package leetcode.problem.p0;

public class P209 {

  public static void main(String[] args) {
    int target = 11;
//    int target = 11;
//    int target = 4;
//    int target = 7;
    int[] nums = {1, 2, 3, 4, 5};
//    int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
//    int[] nums = {1,4,4};
//    int[] nums = {2, 3, 1, 2, 4, 3};
    System.out.println(new P209().minSubArrayLen(target, nums));
  }

  public int minSubArrayLen(int target, int[] nums) {
    if (nums.length == 1 && nums[0] >= target) {
      return 1;
    }
    int answer = 1;
    int count = 1;
    int sum = nums[0];
    int left = 0;
    int right = 1;

    while (left < right) {
      if (left == 0 && right == nums.length && sum < target) {
        return 0;
      }
      if (sum <= target && right < nums.length) {
        sum += nums[right++];
        count++;
      } else {
        sum -= nums[left++];
        count--;
      }

      if (sum >= target) {
        if (answer == 1) {
          answer = count;
        }
        answer = Math.min(answer, count);
      }
    }
    return answer;
  }
}


/**
 * 0
 * 0 1
 * 0   2
 * 0     3
 *   1   3
 *   1     4
 *     2   4
 *     2     5
 *       3   5
 *         4 5
 *           5
 */
