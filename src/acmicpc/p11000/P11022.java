package acmicpc.p11000;

import java.util.Scanner;

public class P11022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0;
		int b = 0;
		for (int i = 0; i < N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i + 1, a, b, a + b);
		}
		sc.close();
	}
}
