package acmicpc.p1000;

import java.util.Arrays;
import java.util.Scanner;

public class P1202 {
	
	static final int MASS = 0;
	static final int VALUE = 1;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[][] gems= new int[N][2];
		int[] bags = new int[K];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				gems[i][j] = sc.nextInt();
			}
		}
		
		Arrays.sort(gems[0]);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(gems[i][j] + " ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < K; i++) bags[i] = sc.nextInt();

		
		
		sc.close();
	}
}

class Gem {
	
	int mass;
	int value;
	
	
}
