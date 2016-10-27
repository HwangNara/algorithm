// TODO 푸는중...

package acmicpc.p1000;

import java.util.Scanner;

public class P1629 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		sc.close();
		
		System.out.println(calc(A, B,  C));
	}

	private static long calc(long a, long b, long c) {
		if (b == 0) return 1;
		
		if ((b & 1) == 1) return (a * calc(a, b - 1, c)) % c;
		return (long) Math.pow(calc(a, b / 2, c), 2) % c;
	}
}
