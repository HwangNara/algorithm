package acmicpc.p1000;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P1660 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		List<Integer> v = new LinkedList<>();
		v.add(1);
		for (int i = 2;; i++) {
			int s = ((i + 1) * i) / 2;
			s += v.get(i - 2);
			if (s > N) break;
			v.add(s);
		}
		
		int[] dp = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			dp[i] = Integer.MAX_VALUE;
			for (int j = 0; j < v.size(); j++) {
				int tmp = v.get(j);
				if (tmp > N || tmp > i) break;
				if (dp[i - tmp] + 1 < dp[i]) dp[i] = dp[i - tmp] + 1;
			}
		}
		System.out.println(dp[N]);
	}
}
