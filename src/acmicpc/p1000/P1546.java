package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1546 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] score = new int[N];
		int max = Integer.MIN_VALUE;
		double ans = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
			if (score[i] > max) max = score[i];
		}
		
		for (int i = 0; i < N; i++) ans += (double) score[i] / max * 100;
		System.out.printf("%.2f", ans / N);
	}
}
