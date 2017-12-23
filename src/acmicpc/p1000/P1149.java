package acmicpc.p1000;

import java.util.Scanner;

public class P1149 {
	
	static final int colorNum = 3;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] rgb = new int[2][3];
		int[][] cost = new int[2][3];
		
		for (int i = 0; i < colorNum; i++) {
			rgb[0][i] = sc.nextInt();
			cost[0][i] = rgb[0][i];
		}
		
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < colorNum; j++) {
				rgb[i & 1][j] = sc.nextInt();
			}
			for (int j = 0; j < colorNum; j++) {
				cost[i & 1][j] = Math.min(rgb[i & 1][j] + cost[(i - 1) & 1][(j + 1) % 3], 
										  rgb[i & 1][j] + cost[(i - 1) & 1][(j + 2) % 3]);	
			}
		}
		
		System.out.println(min(cost[(N - 1) & 1][0], cost[(N - 1) & 1][1], cost[(N - 1) & 1][2]));
		sc.close();
	}

	private static int min(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);
	}
}
