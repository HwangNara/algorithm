package acmicpc.p2000;

import java.util.Scanner;

public class P2460 {
	
	static final int N = 10;
	static int currentUser = 0;
	static int answer = Integer.MIN_VALUE;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < N; i++) {
			currentUser = currentUser - sc.nextInt() + sc.nextInt();
			if (currentUser > answer) answer = currentUser;
		}
		System.out.println(answer);
		sc.close();
	}
}
