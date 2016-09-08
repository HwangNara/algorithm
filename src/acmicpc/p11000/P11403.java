package acmicpc.p11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class P11403 {
	
	static List<Integer>[] lists;
	static int[][] map;
	static int[][] result;
	static boolean[] visited;
	static int answer;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		result = new int[N][N];
		lists = new LinkedList[N];
		for (int i = 0; i < lists.length; i++) {
			lists[i] = new LinkedList<>();
		}
		
		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				map[i][j] = num;
				if (num == 1) lists[i].add(j);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				answer = 0; 
				visited = new boolean[N];
				getAnswer(i, j);
				result[i][j] = answer;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void getAnswer(int src, int dst) {
		Stack<Integer> stack = new Stack<>();
		stack.addAll(lists[src]);
		while (!stack.isEmpty()) {
			int temp = stack.pop();
			if (temp == dst) {
				answer = 1;
				return;
			}
			if (!visited[temp]) {
				visited[temp] = true;
				getAnswer(temp, dst);
			}
		}
	}
}
