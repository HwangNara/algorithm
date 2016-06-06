package acmicpc.p2000;

import java.util.Scanner;

public class P2523 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = N - 1; Math.abs(i) < N; i--) {
			for (int j = 0; j < N - Math.abs(i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
