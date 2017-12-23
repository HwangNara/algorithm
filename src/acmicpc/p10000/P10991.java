package acmicpc.p10000;

import java.util.Scanner;

public class P10991 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < n; i++) {
			int space = n - i - 1;
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
				if (j != i) System.out.print(" ");
			}
			if (i + 1 != n) System.out.println();
		}
	}
}
