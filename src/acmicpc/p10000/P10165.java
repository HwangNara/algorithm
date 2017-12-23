package acmicpc.p10000;

import java.util.Scanner;

public class P10165 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		if (N == 1 || M == 1) {
			System.out.println(1);
		} else if (K == 0) {
			System.out.println(dp(N - 1, M - 1));
		} else {
			int row = K / M + (K % M == 0 ? -1 : 0);
			int col = K % M - 1;
			if (col < 0) col = M - 1;
			long answer1 = dp(row, col);

			row = N - row - 1;
			col = M - col - 1;
			if (col < 0) col = 1;
			long answer2 = dp(row, col);
			System.out.println(answer1 * answer2);
		}
	}

	private static long dp(int row, int col) {
		long[][] dp = new long[row + 1][col + 1];
		for (int i = 0; i < row + 1; i++) dp[i][0] = 1;
		for (int j = 0; j < col + 1; j++) dp[0][j] = 1;
		
		for (int i = 1; i < row + 1; i++) {
			for (int j = 1; j < col + 1; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}
		return dp[row][col];
	}
}
