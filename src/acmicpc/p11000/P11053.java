package acmicpc.p11000;

import java.util.Scanner;

public class P11053 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] height = new int[N];
		int[] dp = new int[N];
		int answer = 1;
		
		for (int i = 0; i < N; i++) height[i] = sc.nextInt();
		sc.close();

		for (int i = 0; i < N; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (height[i] > height[j] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
				if (dp[i] > answer) answer = dp[i];
			}
		}
		
		System.out.println(answer);
	}
}
