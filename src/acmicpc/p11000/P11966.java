package acmicpc.p11000;

import java.util.Scanner;

public class P11966 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		while (true) {
			if (n == 1) {
				System.out.println("1");
				break;
			}
			if (n == 2) {
				System.out.println("1");
				break;
			}

			if (n % 2 != 0) {
				System.out.println("0");
				break;
			} else {
				n /= 2;
			}
			
		}
		
		sc.close();
	}
}
