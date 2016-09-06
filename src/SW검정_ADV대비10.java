import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class SW검정_ADV대비10 {

	static int[][] input = new int[30][30];
	static int[][] discovered = new int[30][30];
	static int N;
	static int answer;
	static Queue<Integer> queue = new ArrayDeque<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			N = sc.nextInt();
			answer = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					input[i][j] = sc.nextInt();
				}
			}
			
			bfs();
			System.out.printf("#%d %d\n", t, answer);
		}
		sc.close();
	}

	private static void bfs() {
		
		int tmp, row, col;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				discovered[i][j] = 0;
			}
		}
		queue.clear();
		queue.add(0);
		
		loop : while (!queue.isEmpty()) {
			tmp = queue.poll();
			row = tmp / N;
			col = tmp % N;
			
			for (int i = 1; i <= input[row][col]; i++) {
				if (row + i >= N) break;
				
				if (discovered[row + i][col] == 0) {
					queue.add((row + i) * N + col);
					discovered[row + i][col] = discovered[row][col] + 1;
					
					if (row + i == N - 1 && col == N - 1) {
						break loop;
					}
				}
			} 
			
			for (int i = 1; i <= input[row][col]; i++) {
				if (col + i >= N) break;
				
				if (discovered[row][col + i] == 0) {
					queue.add(row * N + col + i);
					discovered[row][col + i] = discovered[row][col] + 1;
					
					if (row == N - 1 && col + i == N - 1) {
						break loop;
					}
				}
			}
		}
		answer = discovered[N - 1][N - 1];
	}
}
