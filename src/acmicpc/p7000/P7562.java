package acmicpc.p7000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7562 {
	
	static int dst, ans, I;
	static boolean findAns;
	static boolean[][] visited;
	static Queue<Integer> que = new LinkedList<>();
	static List<Integer> tmpList = new LinkedList<>();

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int tc = 1; tc <= T; tc++) {
			
			I = Integer.parseInt(br.readLine());
			visited = new boolean[I][I];
			ans = 0;
			findAns = false;
			que.clear();
			tmpList.clear();
			
			st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			que.offer(I*y + x);
			visited[y][x] = true;
			
			st = new StringTokenizer(br.readLine());
			dst = I*Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			
			while (true) {
				tmpList.clear();
				int tmp = 0;
				while (!que.isEmpty()) {
					tmp = que.poll();
					moveAll(tmp);
				}
				
				que.addAll(tmpList);
				if (findAns || tmp == dst) break;
				ans++;
			}
			System.out.println(ans);
		}
	}

	private static void moveAll(int n) {
		if (n == dst) {
			findAns = true;
			return;
		}

		int x = n / I;
		int y = n % I;
		move(y - 2, x + 1);
		move(y - 1, x + 2);
		move(y + 1, x + 2);
		move(y + 2, x + 1);
		move(y + 2, x - 1);
		move(y + 1, x - 2);
		move(y - 1, x - 2);
		move(y - 2, x - 1);
	}

	private static void move(int x, int y) {
		
		if (x < 0 || y < 0 || x >= I || y >= I) return;
		if (!visited[y][x]) {
			visited[y][x] = true;
			tmpList.add(y * I + x);
		}
	}
}
