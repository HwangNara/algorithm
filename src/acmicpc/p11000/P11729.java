package acmicpc.p11000;

import java.util.Scanner;

public class P11729 {
	
	static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		hanoi(N, 0, 2);
		System.out.println((int) Math.pow(2, N) - 1);
		System.out.println(sb);
	}

	private static void hanoi(int n, int cur, int dest) {
		if (n == 1) {
			sb.append(++cur + " " + ++dest + "\n");
			return;
		}
		int temp = 3 - (cur + dest);
		hanoi(n - 1, cur, temp);
		hanoi(1, cur, dest);
		hanoi(n - 1, temp, dest);
	}
}
