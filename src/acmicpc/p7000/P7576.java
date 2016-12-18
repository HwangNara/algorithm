package acmicpc.p7000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class P7576 {

	static int M, N;
	static int zeroCnt, minusCnt, ans;
	static int[][] d;
	static Queue<Integer> que = new LinkedList<>();
	static List<Integer> tmpList = new LinkedList<>();
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		d = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				d[i][j] = tmp;
				if (tmp == 0) zeroCnt++;
				if (tmp == -1) minusCnt++;
				if (tmp == 1) que.offer(i * M + j);
			}
		}
			
		while (true) {
			tmpList.clear();
			while (!que.isEmpty()) {
				int tmp = que.poll();
				int i = tmp / M;
				int j = tmp % M;
				
				plus(i + 1, j);
				plus(i - 1, j);
				plus(i, j + 1);
				plus(i, j - 1);
			}
			if (tmpList.isEmpty()) break;
			que.addAll(tmpList);
			ans++;
		}
		
		System.out.println(minusCnt == M*N ? -1 : zeroCnt == 0 ? ans : -1);
	}

	private static void plus(int i, int j) {
		if (i < 0 || j < 0 || i >= N || j >= M) return;
		if (d[i][j] == -1) return;
		if (d[i][j] == 0) {
			d[i][j] = 1;
			tmpList.add(i * M + j);
			zeroCnt--;
		}
	}
}

