package acmicpc.p2000;

import java.util.Scanner;

public class P2846 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] roads = new int[N];
		for (int i = 0; i < N; i++) roads[i] = sc.nextInt();
		int answer = 0;
		int standard = roads[0];
		for (int i = 1; i < N; i++) {
			if (roads[i] - roads[i - 1] > 0) {
				answer = roads[i] - standard > answer ? roads[i] - standard : answer;
			} else {
				standard = roads[i];
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
