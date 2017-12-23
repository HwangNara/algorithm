package acmicpc.p9000;

import java.util.Scanner;

public class P9295 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			System.out.printf("Case %d: %d\n", tc, sc.nextInt() + sc.nextInt());
		}
		sc.close();
	}
}
