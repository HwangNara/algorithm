package acmicpc.p2000;

import java.util.Scanner;

public class P2506 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int score = 1;
		int result = 0;
		for (int i = 0; i < N; i++) {
			if (sc.nextInt() == 1) {
				result += score;
				score++;
			} else {
				score = 1;
			}
		}
		System.out.println(result);
		sc.close();
	}
}
