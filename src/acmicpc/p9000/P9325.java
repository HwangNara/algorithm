package acmicpc.p9000;

import java.util.Scanner;

public class P9325 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int price = sc.nextInt();
			int N = sc.nextInt();
			for (int j = 0; j < N; j++) {
				price += sc.nextInt() * sc.nextInt();
			}
			
			System.out.println(price);
		}
		sc.close();
	}
}
