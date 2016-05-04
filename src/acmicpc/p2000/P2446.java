package acmicpc.p2000;

import java.util.Scanner;

public class P2446 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int M = N - 1;
		for (int i = 0; i < 2 * M + 1; i++) {
			for (int j = 0; j < M - Math.abs(M - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * Math.abs(M - i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}