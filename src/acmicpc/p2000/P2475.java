package acmicpc.p2000;

import java.util.Scanner;

public class P2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println((int)(Math.pow(sc.nextInt(), 2) + Math.pow(sc.nextInt(), 2) + Math.pow(sc.nextInt(), 2) + Math.pow(sc.nextInt(), 2) + Math.pow(sc.nextInt(), 2)) % 10);
		sc.close();
	}
}
