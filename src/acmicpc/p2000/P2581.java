package acmicpc.p2000;

import java.util.Scanner;

public class P2581 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int first = 0;
		int sum = 0;
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		for (int i = M; i <= N; i++) {
			if (primeCheck(i)) {
				first = first == 0 ? i : first; 
				sum += i;
			}
		}
		System.out.println(sum == 0 ? "-1" : (sum + "\n" + first));
	}

	private static boolean primeCheck(int i) {
		if (i == 1) return false;
		for (int k = 2; k <= Math.sqrt(i); k++) {
			if (i % k == 0) return false;
		}
		return true;
	}
}
