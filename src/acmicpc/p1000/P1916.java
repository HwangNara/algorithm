// TODO 풀던중... visited 어떻게?
package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1916 {

	static int N;
	static int M;
	static int[] answer; 
	static int[][] cost;
	static boolean[] visited;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		cost = new int[N + 1][N + 1];
		answer = new int[N + 1];
		visited = new boolean[N + 1];
		int start;
		int end;
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				cost[i][j] = Integer.MAX_VALUE;
			}
		}
		for (int i = 1; i <= N; i++) answer[i] = Integer.MAX_VALUE;
		
		StringTokenizer st;
		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			cost[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())]
					= Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		
		answer[start] = 0;
		visited[start] = true;
		
		int minIndex = findMinIndex();
		visited[minIndex] = true;
		
		System.out.println(answer[end]);
	}

	private static int findMinIndex() {
		int minIndex = 0;
		int minValue = 0;
		int temp = 0;
		
		for (int k = 1; k <= N; k++) {
			if (visited[k]) continue;
			for (int i = 1; i <= N; i++) {
				temp = cost[k][i];
				if (minValue > temp && !visited[i]) {
					minValue = temp;
					minIndex = i;
				}
				
				if (answer[i] > answer[k] + temp) {
					answer[i] = answer[k] + temp;
				}
			}

		}
		
		return minIndex;
	}
}
