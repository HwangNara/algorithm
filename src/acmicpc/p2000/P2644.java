package acmicpc.p2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P2644 {

	static int n, src, dst, r;
	static boolean[][] map;
	static int[] ans;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new boolean[n+1][n+1];
		ans = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		src = Integer.parseInt(st.nextToken());
		dst = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) ans[i] = -1;
		for (int i = 0; i < r; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			map[a][b] = true;
			map[b][a] = true;
		}

		bfs(src);
		System.out.println(ans[dst]);
	}

	private static void bfs(int src) {

		Queue<Integer> que = new LinkedList<>();
		que.offer(src);
		ans[src] = 0;
		
		while (!que.isEmpty()) {
			int x = que.poll();
			for (int y = 1; y <= n; y++) {
				if (x == y) continue;
				if (map[x][y] && ans[y] == -1) {
					ans[y] = ans[x] + 1;
					que.add(y);
					if (y == dst) return;
				}
			}
		}
	}
}
