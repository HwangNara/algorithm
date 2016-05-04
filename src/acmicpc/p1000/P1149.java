package acmicpc.p1000;

import java.util.Scanner;

public class P1149 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] rgb = new int[2][3];
		int[][] cost = new int[2][3];
		
		// 처음 한 줄 세팅
		rgb[0][0] = sc.nextInt();
		rgb[0][1] = sc.nextInt();
		rgb[0][2] = sc.nextInt();
		cost[0][0] = rgb[0][0];
		cost[0][1] = rgb[0][1];
		cost[0][2] = rgb[0][2];
		
		for (int i = 1; i < N; i++) {
			rgb[i & 1][0] = sc.nextInt();
			rgb[i & 1][1] = sc.nextInt();
			rgb[i & 1][2] = sc.nextInt();
			cost[i & 1][0] = min(rgb[i & 1][0] + cost[(i - 1) & 1][1], rgb[i & 1][0] + cost[(i - 1) & 1][2]);
			cost[i & 1][1] = min(rgb[i & 1][1] + cost[(i - 1) & 1][0], rgb[i & 1][1] + cost[(i - 1) & 1][2]);
			cost[i & 1][2] = min(rgb[i & 1][2] + cost[(i - 1) & 1][0], rgb[i & 1][2] + cost[(i - 1) & 1][1]);
		}
		
		System.out.println(min(cost[(N - 1) & 1][0], cost[(N - 1) & 1][1], cost[(N - 1) & 1][2]));
		sc.close();
	}

	private static int min(int a, int b, int c) {
		if (a <= b && a <= c) {
			return a;
		} else if (b <= a && b <= c) {
			return b;
		} else if (c <= a && c <= b) {
			return c;
		}
		return -1;
	}

	private static int min(int a, int b) {
		return a > b ? b : a;
	}
}
