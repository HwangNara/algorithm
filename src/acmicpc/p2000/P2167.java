// TODO Çª´Â Áß
package acmicpc.p2000;

import java.util.Scanner;

public class P2167 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] values = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				values[i][j] = sc.nextInt();
			}
		}
		
		int K = sc.nextInt();
		int i, j, x, y;
		int answer = 0;
		for (int n = 0; n < K; n++) {
			answer = 0;
			i = sc.nextInt() - 1;
			j = sc.nextInt() - 1;
			x = sc.nextInt() - 1;
			y = sc.nextInt() - 1;
			
			for (int a = i; a <= x; a++) {
				for (int b = j; b <= y; b++) {
					answer += values[a][b];
				}
			}
			System.out.println(answer);
			
		}
		
		
		sc.close();
	}
}
