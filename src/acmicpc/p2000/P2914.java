package acmicpc.p2000;

import java.util.Scanner;

public class P2914 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int avg = sc.nextInt();
		System.out.println(num * (avg - 1) + 1);
		
		sc.close();
	}
}
