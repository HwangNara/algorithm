package acmicpc.p11000;

import java.util.Scanner;

public class P1912 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = i; j < n; j++) {
				temp += nums[j];
				if (temp > max) max = temp;
			}
		}
		System.out.println(max);
		sc.close();
	}
}
