package acmicpc.p1000;

import java.util.Scanner;

public class P1934 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a, b, gcd;
		
		for (int i = 0; i < N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			gcd = getGcd(a > b ? a : b, b <= a ? b : a);
			System.out.println(a * b / gcd);
		}
		sc.close();
	}

	private static int getGcd(int a, int b) {
		if (a == 1 || b == 1) return 1;
		return a % b == 0 ? b : getGcd(b, a % b);
	}
}
