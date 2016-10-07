package acmicpc.p2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2579 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] s = new int[N + 1];
		int[][] dp = new int[N + 1][2];
		
		for (int i = 1; i <= N; i++) s[i] = Integer.parseInt(br.readLine());
		
		dp[1][0] = 0;
		dp[1][1] = s[1];
		dp[2][0] = s[1];
		dp[2][1] = s[1] + s[2];
		for (int i = 3; i <= N; i++) {
			dp[i][0] = dp[i - 1][1];
			dp[i][1] = Math.max(dp[i - 2][0] + s[i - 1] + s[i], 
								dp[i - 2][1] + s[i]);
		}
		System.out.println(dp[N][1]);
	}
}
