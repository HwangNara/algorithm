package acmicpc.p2000;

import java.util.Scanner;

public class P2609 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp;
		int gcd;
		
		if (a > b) {
			temp = b;
			b = a;
			a = temp;
		}
		gcd = getGcd(a, b);
		System.out.println(gcd);
		System.out.println(gcd * (a / gcd) * (b / gcd));
		sc.close();
	}

	private static int getGcd(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return getGcd(b, a % b);
		}
	}
}
