package acmicpc.p2000;

import java.util.Arrays;
import java.util.Scanner;

public class P2752 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
		Arrays.sort(nums);
		
		for (int i : nums) System.out.print(i + " ");
		sc.close();
	}
}
