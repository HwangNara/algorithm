package acmicpc.p1000;

import java.util.Scanner;

public class P1012 {

	static boolean[][] cabbage;
	static boolean[][] visited;
	static int M, N, K, X, Y, cnt, answer;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 0; tc < T; tc++) {
			answer = 0;
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();
			cabbage = new boolean[N][M];
			visited = new boolean[N][M];
		
			for (int i = 0; i < K; i++) {
				X = sc.nextInt();
				Y = sc.nextInt();
				cabbage[Y][X] = true;
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					cnt = 0;
					findWarm(i, j);
					if (cnt != 0) answer++;
				}
			}
			System.out.println(answer);
		}
		sc.close();
	}

	private static void findWarm(int i, int j) {
		
		if (visited[i][j] || !cabbage[i][j]) return;
		visited[i][j] = true;
		cnt++; 
		
		if (i != 0) findWarm(i - 1, j);
		if (i != N - 1) findWarm(i + 1, j);
		if (j != 0) findWarm(i, j - 1);
		if (j != M - 1) findWarm(i, j + 1);
	}
}
