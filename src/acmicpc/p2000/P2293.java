package acmicpc.p2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2293 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] coins = new int[N];
		long[] dp = new long[K + 1];
		
		for (int i = 0; i < N; i++) coins[i] = Integer.parseInt(br.readLine());

		dp[0] = 1;
		for (int c = 0; c < N; c++) {
			for (int m = coins[c]; m <= K; m++) {
				dp[m] += dp[m - coins[c]];
			}
		}
		System.out.println(dp[K]);
	}
}
