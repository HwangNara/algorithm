package acmicpc.p11000;

import java.util.Scanner;

public class P11021 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.printf("Case #%d: %d\n", i + 1, sc.nextInt() + sc.nextInt());
		}
		sc.close();
	}
}
