package acmicpc.p11000;

import java.util.Scanner;

public class P11051 {
	
	static final int mod = 10007;
	static int[][] combi;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		combi = new int[N + 1][N + 1];
		for (int i = 0; i <= N; i++) {
			combi[i][0] = 1;
			combi[i][i] = 1;
		}
		for (int n = 2; n <= N; n++) {
			for (int r = 1; r <= N; r++) {
				combi[n][r] = combi[n - 1][r] % mod + combi[n - 1][r - 1] % mod;
				combi[n][r] %= mod;
			}
			if (combi[N][K] != 0 ) break;
		}
		
		System.out.println(combi[N][K]);
	}

}
