package acmicpc.p2000;

import java.util.Scanner;

public class P2581 {

	static int first = 0;
	static int answer = 0;
	static boolean isFirst = true;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		for (int i = M; i <= N; i++) {
			if(primeCheck(i)) {
				if (isFirst) first = i;
				answer += i;
				isFirst = false;
			}
		}
		if (answer == 0) {
			System.out.println(-1);
		} else {
			System.out.printf("%d\n%d", answer, first);
		}
		
		sc.close();
	}

	private static boolean primeCheck(int i) {
		if (i == 1) return false;
		for (int k = 2; k <= Math.sqrt(i); k++) {
			if (i % k == 0) {
				return false;
			}
		}
		return true;
	}
}
