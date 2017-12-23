package acmicpc.p2000;

import java.util.Scanner;

public class P2355 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long i = sc.nextLong();
		long j = sc.nextLong();
		sc.close();

		System.out.println(((i + j) * (Math.abs(i - j) + 1) / 2));
	}
}
