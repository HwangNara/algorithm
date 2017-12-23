package acmicpc.p1000;

import java.util.Scanner;

public class P1964 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		long[] v = new long[2];
		v[1] = 5;
		for (int i = 2; i <= N; i++) {
			v[i & 1] = v[(i - 1) & 1] + 3 * i + 1;
		}
		System.out.println(v[N & 1] % 45678);
	}
}
