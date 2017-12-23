package acmicpc.p1000;

import java.util.Scanner;

public class P1009 {

	static int a, b, answer;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			a = sc.nextInt();
			b = sc.nextInt();
			answer = a % 10;
			for (int i = 0; i < b - 1; i++) {
				answer = (answer * a) % 10;
			}
			System.out.println(answer == 0 ? 10 : answer);
		}
		sc.close();
	}
}
