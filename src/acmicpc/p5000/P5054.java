package acmicpc.p5000;

import java.util.Scanner;

public class P5054 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int testCase = 0; testCase < T; testCase++) {
			int N = sc.nextInt();
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < N; i++) {
				int temp = sc.nextInt();
				if (min > temp)	min = temp;
				if (max < temp) max = temp;
			}
			System.out.println(2 * (max - min));
		}
		sc.close();
	}
}
