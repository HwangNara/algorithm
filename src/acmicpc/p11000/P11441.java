package acmicpc.p11000;

import java.util.Scanner;

public class P11441 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N + 1];
		int[] accumSum = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			nums[i] = sc.nextInt();
			accumSum[i] += accumSum[i - 1] + nums[i];
		}
		
		int M = sc.nextInt();
		int i, j;
		for (int n = 0; n < M; n++) {
			i = sc.nextInt();
			j = sc.nextInt();
			if (i == j) {
				System.out.println(nums[i]);
			} else {
				System.out.println(accumSum[j] - accumSum[i - 1]);
			}
		}
		
		sc.close();
	}
}
