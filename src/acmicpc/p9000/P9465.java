package acmicpc.p9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9465 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= T; testCase++) {
			
			int N = Integer.parseInt(br.readLine());
			long[][] s = new long[N + 1][2];
			long[][] d = new long[N + 1][2];
			StringTokenizer st;
			
			for (int i = 0; i < 2; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 1; j <= N; j++) {
					s[j][i] = Integer.parseInt(st.nextToken()); 
				}
			}

			d[1][0] = s[1][0];
			d[1][1] = s[1][1];
			
			if (N >= 2) {
				d[2][0] = d[1][1] + s[2][0];
				d[2][1] = d[1][0] + s[2][1];
			}
			

			for (int i = 3; i <= N; i++) {
				d[i][0] = s[i][0] + Math.max(d[i - 2][1], d[i - 1][1]);
				d[i][1] = s[i][1] + Math.max(d[i - 2][0], d[i - 1][0]);
			}
			System.out.println(Math.max(d[N][0], d[N][1]));
		}
	}
}
