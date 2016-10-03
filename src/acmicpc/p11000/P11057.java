package acmicpc.p11000;

import java.util.Scanner;

public class P11057 {
	
	static int mod = 10007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		long D[][] = new long[N + 1][10];
		
		for (int i = 0; i <= 9; i++) {
			D[1][i] = 1;
		}
		
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= j; k++) {
					D[i][j] += D[i - 1][k];
					D[i][j] %= mod;
				}
			}
		}
		
		long answer = 0;
		for (int i = 0; i <= 9; i++) {
			answer += D[N][i];
			answer %= mod;
		}
		
		System.out.println(answer);
	}
}
