package acmicpc.p1000;

import java.util.Scanner;

public class P1010 {
	
	static int[][] d;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T  =sc.nextInt();
		int r;
		int n;
		for (int i = 0; i < T; i++) {
			r = sc.nextInt();
			n = sc.nextInt();
			d = new int[r + 1][n + 1];
			System.out.println(combination(n, r));
		}
		sc.close();
	}

	private static int combination(int n, int r) {
		if (r == 0 || n == 0 || n == r) return 1;
		if (d[r][n] != 0) return d[r][n];
		d[r][n] = combination(n - 1, r) + combination(n - 1, r - 1);
		return d[r][n];
	}
}
