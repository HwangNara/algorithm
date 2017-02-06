package acmicpc.p1000;

import java.util.Scanner;

public class P1946 {
	
	static int MAX = 100000;
	static int[] e = new int[MAX+1];

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) e[sc.nextInt()] = sc.nextInt();
			
			int ans = 1;
			int min = e[1];
			for (int i = 2; i <= N; i++) {
				if (i == N && e[N] != 1) break;
				if (min < e[i]) continue;
				if (min > e[i]) min = e[i];
				ans++;
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
