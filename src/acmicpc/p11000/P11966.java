package acmicpc.p11000;

import java.util.Scanner;

public class P11966 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		byte answer = 0;
		
		while (true) {
			if (n == 1) {
				answer = 1;
				break;
			}

			if ((n & 1) == 1) {
				answer = 0;
				break;
			}
			n = n >> 1;
		}
		System.out.println(answer);
		sc.close();
	}
}
