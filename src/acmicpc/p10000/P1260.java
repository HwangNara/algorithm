package acmicpc.p10000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class P1260 {

	static List<Integer>[] list;
	static Queue<Integer> que;
	static boolean[] visited;
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		int S = sc.nextInt();
		list = new ArrayList[V];
		que = new ArrayDeque<>();
		int d1, d2;
		
		for (int i = 0; i < list.length; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < E; i++) {
			d1 = sc.nextInt() - 1;
			d2 = sc.nextInt() - 1;
			list[d1].add(d2);
			list[d2].add(d1);
		}
		
		// 오름차순 정렬
		for (int i = 0; i < list.length; i++) {
			Collections.sort(list[i]);
		}
		
		visited = new boolean[V];
		dfs(S - 1);
		System.out.println();
		visited = new boolean[V];
		bfs(S - 1);

		sc.close();
	}

	private static void dfs(int s) {
		visited[s] = true;
		
		System.out.print(s + 1 + " ");
		
		if (list[s] != null) {
			for (int i : list[s]) {
				if (visited[i]) continue;
				dfs(i);
			}
		}
	}

	private static void bfs(int s) {
		
		int node;
		
		que.add(s);
		visited[s] = true;
		
		while (que.size() > 0) {
			node = que.poll();
			System.out.print(node + 1 + " ");
			for (int i : list[node]) {
				if (!visited[i]) {
					que.add(i);
					visited[i] = true;
				}
			}
		}
		
	}
}
