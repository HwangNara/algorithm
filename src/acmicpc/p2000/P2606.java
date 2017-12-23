package acmicpc.p2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2606 {

	static int N, K;
	static boolean[][] com;
	static boolean[] check;
	static int ans;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		com = new boolean[N+1][N+1];
		check = new boolean[N+1];
		
		StringTokenizer st;
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int min = Math.min(a, b);
			int max = Math.max(a, b);
			com[min][max] = true;
		}
		
		check[1] = true;
		dfs(1);
		System.out.println(ans);
	}

	private static void dfs(int num) {
		
		for (int i = 1; i <= N; i++) {
			if (i == num) continue;
			int min = Math.min(num, i);
			int max = Math.max(num, i);

			if (check[min] && check[max]) continue;
			if (com[min][max]) {
				process(min);
				process(max);
			}
		}
	}

	private static void process(int n) {
		if (!check[n]) {
			ans++;
			check[n] = true;
			dfs(n);
		}
	}
}
