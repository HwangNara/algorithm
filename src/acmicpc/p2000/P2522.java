package acmicpc.p2000;

import java.util.Scanner;

public class P2522 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int absI;
		for (int i = N - 1; Math.abs(i) <= N - 1; i--) {
			absI = Math.abs(i);
			for (int j = 0; j < absI; j++) System.out.print(" ");
			for (int j = 0; j < N - absI; j++) System.out.print("*");
			System.out.println();
		}
		sc.close();
	}
}
