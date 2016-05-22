package acmicpc.p4000;

import java.util.Scanner;

public class P4344 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int[] scores;
		double avg;
		int cnt;
		for (int tc = 0; tc < T; tc++) {
			N = sc.nextInt();
			scores = new int[N];
			avg = 0;
			cnt = 0;
			for (int i = 0; i < N; i++)	{
				scores[i] = sc.nextInt();
				avg += scores[i];
			}
			avg /= N;
			
			for (int i = 0; i < N; i++) {
				if (scores[i] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n", ((double)cnt / N) * 100);
		}
		sc.close();
	}
}
