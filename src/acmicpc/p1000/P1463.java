package acmicpc.p1000;

import java.util.Scanner;

public class P1463 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ans = new int[N + 1];
		
		ans[1] = 0;
		for (int i = 2; i <= N; i++) {
			ans[i] = ans[i - 1] + 1;
			
			if (i % 3 == 0 && ans[i] > ans[i / 3] + 1) {
				ans[i] = ans[i / 3] + 1;
			}
			if (i % 2 == 0 && ans[i] > ans[i / 2] + 1) {
				ans[i] = ans[i / 2] + 1;
			}
		}
		System.out.println(ans[N]);
		
		sc.close();
	}
}
