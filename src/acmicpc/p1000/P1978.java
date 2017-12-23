package acmicpc.p1000;

import java.util.Scanner;

public class P1978 {
	
	static int answer = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (isPrime(sc.nextInt())) answer++;
		}
		System.out.println(answer);
		sc.close();
	}

	private static boolean isPrime(int num) {
		if (num == 1) return false;
		if (num != 2 && (num & 1) == 0) return false; 
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
}
