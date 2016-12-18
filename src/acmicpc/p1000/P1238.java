package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1238 {

	static int N, M, X;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken()) - 1;
		
		int[][] d = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				d[i][j] = i == j ? 0 : (int)1e5;
			}
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			d[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] 
					= Integer.parseInt(st.nextToken());
		}
		
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (d[i][j] > d[i][k] + d[k][j])
						d[i][j] = d[i][k] + d[k][j];
				}
			}
		}
		
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			if (i == X) continue;
			ans = Math.max(ans, d[i][X] + d[X][i]);
		}
		
		System.out.println(ans);
	}
}
