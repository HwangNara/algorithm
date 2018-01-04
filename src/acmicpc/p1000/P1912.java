package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1912 {

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.MIN_VALUE;
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
            dp[i] = (dp[i-1] > 0 ? dp[i-1] : 0) + Integer.parseInt(st.nextToken());
            max = Math.max(dp[i], max);
        }
		System.out.println(max);
	}
}