package acmicpc.p10000;

import java.util.Scanner;

public class P10797 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int n = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			if (n == sc.nextInt()) {
				answer++;
			}
		}
		System.out.println(answer);
		
		sc.close();
	}
}
