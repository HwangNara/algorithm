package acmicpc.p1000;

import java.util.Scanner;

public class P1929 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(), N = sc.nextInt();
		sc.close();
		
		StringBuilder answer = new StringBuilder();
		for (int i = M; i <= N; i++) {
			if (i > 2 &&(i & 1) == 0) continue; 
			if (isPrime(i)) answer.append(i + "\n");
		}
		System.out.println(answer.toString());
	}

	private static boolean isPrime(int num) {
		if (num == 1) return false;
		for (int j = 3; j * j <= num; j++) {
			if (num % j == 0) return false;
		}
		return true;
	}
	
}
