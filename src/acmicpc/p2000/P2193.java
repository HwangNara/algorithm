package acmicpc.p2000;

import java.util.Scanner;

public class P2193 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		long[][] dp = new long[N + 1][2]; // i자리의 j로 끝나는 개수
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		for (int i = 2; i < dp.length; i++) {
			dp[i][0] = dp[i - 1][0] + dp[i - 1][1];
			dp[i][1] = dp[i - 1][0];
		}
		
		System.out.println(dp[N][0] + dp[N][1]);
	}
}
