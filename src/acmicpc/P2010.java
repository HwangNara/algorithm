package acmicpc;

import java.util.Scanner;

public class P2010 {

	public static void main(String[] args) {
		
		int answer = 0;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) answer += sc.nextInt();
		
		System.out.println(answer - N + 1);
		
		sc.close();
	}
}
