package leetcode.problem.p0;

import java.util.Arrays;

public class P724 {

    public static void main(String[] args) {
        System.out.println(new P724().pivotIndex(new int[] { 0, 0 }));
        System.out.println(new P724().pivotIndex(new int[] { 1, 7, 1 }));
        System.out.println(new P724().pivotIndex(new int[] { 1, 7, 3, 6, 5, 6 }));
        System.out.println(new P724().pivotIndex(new int[] { 1, 7, 4 }));
    }

    public int pivotIndex(int[] nums) {
        final int length = nums.length;
        final int sum = Arrays.stream(nums).sum();
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < length; i++) {
            rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
