package acmicpc.p2000;

import java.util.Scanner;

public class P2456 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] scores = new int[3][3];
		int[] sums = new int[3];
		int value = 0;
		int index = 0;
		int max = 0;
		boolean notFound = false;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				value = sc.nextInt();
				scores[j][value - 1]++;
			}
		}
		
		// 각 사람당 총점 계산
		for (int i = 0; i < sums.length; i++) {
			for (int j = 0; j < 3; j++) {
				sums[i] += (scores[i][j]) * (j + 1);
			}
		}
		
		// 1등 점수 계산
		for (int i = 0; i < 3; i++) {
			if (sums[i] > max) {
				max = sums[i];
				index = i;
			} else if (sums[i] == max) {
				// 3점 갯수
				if (scores[i][2] > scores[index][2]) {
					max = sums[i];
					index = i;
					notFound = false;
				} else if (scores[i][2] == scores[index][2]) {
					// 2점 갯수
					if (scores[i][1] > scores[index][1]) {
						max = sums[i];
						index = i;
					} else if (scores[i][1] == scores[index][1]) {
						notFound = true;
					}
				}
			}
		}
		
		System.out.println((notFound ? 0 : (index + 1)) + " " + max);
		
//		for (int i : sums) { System.out.println(i); }
		sc.close();
	}
}
