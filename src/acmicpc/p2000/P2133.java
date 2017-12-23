package acmicpc.p2000;

import java.util.Scanner;

public class P2133 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		long[] d = new long[31];
		
		d[0] = 1;
		
		for (int i = 2; i <= N; i += 2) {
			d[i] = 3 * d[i - 2];
			for (int j = 4; j <= i; j += 2) {
				d[i] += d[i - j] * 2;
			}
		}
		
		System.out.println(d[N]);
	}
}
