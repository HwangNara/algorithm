package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1915 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] map = new int[n+1][m+1];
		int[][] d = new int[n+1][m+1];
		int answer = Integer.MIN_VALUE;

		for (int i = 1; i <= n; i++) {
			String line = br.readLine();
			for (int j = 1; j <= m; j++) {
				map[i][j] = Integer.parseInt(line.charAt(j-1) + "");
				d[i][j] = map[i][j];
				if (i == 1 || j == 1) answer = Math.max(answer, d[i][j]);
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				
				int leftTop = map[i-1][j-1];
				int left = map[i][j-1];
				int top = map[i-1][j];
				
				if (leftTop == 0 || left == 0 || top == 0 || map[i][j] == 0) continue;
				d[i][j] = leftTop == top && top == left ?
						Math.min(Math.min(d[i][j-1], d[i-1][j]), d[i-1][j-1]) + 1 : d[i][j];
				answer = Math.max(answer, d[i][j]);
			}
		}
		System.out.println(answer*answer);
	}
}
