package acmicpc.p2000;

import java.util.Scanner;

public class P2443 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < N; i++) {
			// °ø¹é
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// º°
			for (int j = 0; j < 2 * (N - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
