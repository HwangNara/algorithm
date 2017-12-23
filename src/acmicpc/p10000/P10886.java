package acmicpc.p10000;

import java.util.Scanner;

public class P10886 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < N; i++) {
			if ((sc.nextInt() & 1) == 1) {
				odd++;
			} else {
				even++;
			}
		}
		
		if (odd > even) {
			System.out.println("Junhee is cute!");
		} else {
			System.out.println("Junhee is not cute!");
		}
		sc.close();
	}
}
