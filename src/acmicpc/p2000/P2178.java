package acmicpc.p2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P2178 {
	
	static int N;
	static int M;
	
	static Queue<Integer> queue;
	static boolean[][] visited;
	static int[][] map;
	static int[][] cost;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] NM = br.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		visited = new boolean[N][M];
		map = new int[N][M];
		cost = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = temp.charAt(j) - 48;
			}
		}
		
		bfs(0);
	}

	private static void bfs(int position) {
		
		queue = new LinkedList<>();
		queue.offer(position);
		visited[0][0] = true;
		cost[0][0] = 1;
		
		int pos;
		while (!queue.isEmpty()) {
			pos = queue.poll();
			int x = pos / M;
			int y = pos % M;
			
			addQueueing(x - 1, y, cost[x][y]);  
			addQueueing(x, y - 1, cost[x][y]);
			addQueueing(x + 1, y, cost[x][y]);
			addQueueing(x, y + 1, cost[x][y]);
		}
		System.out.println(cost[N - 1][M - 1]);
		
	}

	private static void addQueueing(int x, int y, int value) {
		if (x < 0 || y < 0 || x >= N || y >= M) return;
		if (map[x][y] == 1 && !visited[x][y]) {
			visited[x][y] = true;
			queue.offer(x * M + y);
			cost[x][y] = value + 1;
		}
	}
}
