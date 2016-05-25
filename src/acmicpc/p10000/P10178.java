package acmicpc.p10000;

import java.util.Scanner;

public class P10178 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int candy, human;
		for (int i = 0; i < N; i++) {
			candy = sc.nextInt();
			human = sc.nextInt();
			System.out.printf("You get %d piece(s) and your dad gets %d piece(s).\n", candy / human, candy % human);
		}
		
		sc.close();
	}
}
