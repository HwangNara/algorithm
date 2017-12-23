package acmicpc.p2000;

import java.util.Scanner;

public class P2445 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int absI;

		for (int i = N - 1; Math.abs(i) < N; i--) {
			absI = Math.abs(i);
			printStar(N, absI);
			printSpace(absI);
			printSpace(absI);
			printStar(N, absI);
			System.out.println();
		}
		sc.close();
	}

	private static void printSpace(int absI) {
		for (int j = 0; j < absI; j++) {
			System.out.print(" ");
		}
	}

	private static void printStar(int N, int absI) {
		for (int j = 0; j < N - absI; j++) {
			System.out.print("*");
		}
	}
}
