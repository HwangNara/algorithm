package acmicpc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P11048 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input_sample/acm_11048.txt"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] maze = new int[N + 1][M + 1];
		int[][] candy = new int[N + 1][M + 1];
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				maze[i][j] = sc.nextInt();
			}
		}
		
		// 첫 가로줄 & 세로줄 세팅
		for (int i = 1; i <= M; i++) candy[1][i] = maze[1][i];
		for (int i = 1; i <= N; i++) candy[i][1] = maze[i][1];
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= M; j++) {
				candy[i][j] = maze[i][j] + max(candy[i - 1][j - 1], candy[i - 1][j], candy[i][j - 1]);
			}
		}
		
		System.out.println(candy[N][M]);
		sc.close();
	}

	private static int max(int i, int j, int k) {
		int max = i;
		max = j > max ? j : max;
		max = k > max ? k : max;
		return max;
	}
}
