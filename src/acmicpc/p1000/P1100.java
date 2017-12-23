package acmicpc.p1000;

import java.util.Scanner;

public class P1100 {

	private static int answer = 0;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = 8;
		String[] board = new String[N];
		for (int i = 0; i < N; i++) {
			board[i] = sc.nextLine();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = (i & 1); j < N; j += 2) {
				if (board[i].charAt(j) == 'F') answer++;
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
