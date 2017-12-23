package acmicpc.p1000;

import java.util.Arrays;
import java.util.Scanner;

public class P1932 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] nums = new int[N][];
		int[][] d = new int[N][];
		for (int i = 0; i < N; i++) {
			nums[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		
		d[0] = new int[1];
		d[0][0] = nums[0][0];
		for (int i = 1; i < N; i++) {
			d[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					d[i][j] = nums[i][j] + d[i - 1][j];
					continue;
				}
				if (j == i) {
					d[i][j] = nums[i][j] + d[i - 1][j - 1];
					continue;
				}
				int max = max(d[i - 1][j - 1], d[i - 1][j]);
				d[i][j] = nums[i][j] + max;
			}
		}
		Arrays.sort(d[N - 1]);
		System.out.println(d[N - 1][N - 1]);
		sc.close();
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}
}
