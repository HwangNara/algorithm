package acmicpc.p1000;

import java.util.Scanner;

public class P1712 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		if (b >= c) {
			System.out.println("-1");
		} else {
			System.out.println((int)((double)a / (c - b)) + 1);
		}
		sc.close();
	}
}
