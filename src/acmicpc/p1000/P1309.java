package acmicpc.p1000;

import java.util.Scanner;

public class P1309 {
	
	static final int mod = 9901;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt() + 1;
		sc.close();
		
		int[] dp = new int[N];
		dp[0] = 1;
		dp[1] = 3;
		
		for (int i = 2; i < N; i++) {
			dp[i] = (dp[i - 2] + dp[i - 1] * 2) % mod;
		}
		
		System.out.println(dp[N - 1] % mod);
	}
}
