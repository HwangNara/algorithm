package acmicpc.p2000;

import java.util.Scanner;

public class P2588 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a * (b % 10));
		System.out.println(a * ((b / 10) % 10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);
		
		sc.close();
	}
}
