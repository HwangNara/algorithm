package acmicpc.p1000;

import java.util.Scanner;

public class P1913 {

	static final int DOWN = 0;
	static final int RIGHT = 1;
	static final int UP = 2;
	static final int LEFT = 3;
	static int N;
	static int[][] map; 
	static int target;
	static int number;
	static int[] position = new int[2];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		target = sc.nextInt();
		map = new int[N][N];
		number = N * N;

		fillMap(0, 0, DOWN);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println(); 
		}
		System.out.println(position[0] + " " + position[1]);
		sc.close();
	}

	private static void fillMap(int i, int j, int direction) {
		if (i >= N || j >= N) return;
		
		if (map[i][j] == 0) {
			if (number == target) {
				position[0] = i + 1;
				position[1] = j + 1;
			}
			map[i][j] = number--;
		}
		
		if (number == 0) return;
		
		switch (direction) {
		 case DOWN :
			if (i == N - 1 || map[i + 1][j] != 0) {
				j++;
				direction = RIGHT;
			} else {
				i++;
			}
			break;
		case RIGHT :
			if (j == N - 1 || map[i][j + 1] != 0) {
				i--;
				direction = UP;
			} else {
				j++;
			}
			break;
		case UP :
			if (i == 0 || map[i - 1][j] != 0) {
				j--;
				direction = LEFT;
			} else {
				i--;
			}
			break;
		case LEFT :
			if (j == 0 || map[i][j - 1] != 0) {
				i++;
				direction = DOWN;
			} else {
				j--;
			}
			break;
		}
		fillMap(i, j, direction);
	}

}
