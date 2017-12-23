package acmicpc.p11000;

import java.util.Arrays;
import java.util.Scanner;

public class P11399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int T = sc.nextInt();
		int[] nums = new int[T];
		int temp = 0;
		
		for (int i = 0; i < T; i++) {
			nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		temp = nums[0];
		result = temp;

		for (int i = 1; i < T; i++) {
			temp += nums[i];
			result += temp;
		}
		System.out.println(result);
		
		sc.close();
	}
}
