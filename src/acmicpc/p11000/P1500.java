package acmicpc.p11000;

import java.util.Scanner;

public class P1500 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int piece = sc.nextInt();
		long answer = 1L;
		int temp = 0;
		int value = sum / piece;
		int plus = sum - value * piece;
		
		for (int i = 0; i < piece; i++) {
			temp = plus-- > 0 ? 1 : 0;
			temp += value;
			answer *= temp;
		}
		
		System.out.println(answer);
		sc.close();
	}
}
