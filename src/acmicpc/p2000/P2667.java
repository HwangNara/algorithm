package acmicpc.p2000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P2667 {
	
	static List<Integer> answer = new ArrayList<>();
	static int N, counter;
	static boolean[][] house;
	static boolean[][] visited;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N  = Integer.parseInt(sc.nextLine());
		house = new boolean[N][N];
		visited = new boolean[N][N];
		String temp;
		int t;
		for (int i = 0; i < N; i++) {
			temp = sc.nextLine();
			for (int j = 0; j < N; j++) {
				t = temp.charAt(j) - 48;
				house[i][j] = t == 1 ? true : false;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				counter = 0;
				find(i, j);
				if (counter != 0) answer.add(counter);
			}
		}
		
		Collections.sort(answer);
		System.out.println(answer.size());
		for (int ans : answer) {
			System.out.println(ans);
		}
		sc.close();
	}

	private static void find(int i, int j) {
		
		if (visited[i][j] || !house[i][j]) return;
		visited[i][j] = true;
		counter++;
		
		if (i != 0) find(i - 1, j);
		if (i != N - 1) find(i + 1, j);
		if (j != 0) find(i, j - 1);
		if (j != N - 1) find(i, j + 1);
	}
}
