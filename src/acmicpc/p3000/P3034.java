package acmicpc.p3000;

import java.util.Scanner;

public class P3034 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.println(sc.nextInt() <= Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2)) ? "DA" : "NE");
		}
		sc.close();
	}
}
