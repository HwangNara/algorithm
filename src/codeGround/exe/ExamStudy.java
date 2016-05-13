package codeGround.exe;

import java.util.Arrays;
import java.util.Scanner;

public class ExamStudy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int test_case = 0;
		
		for (test_case = 1; test_case <= T; test_case++) {
			int answer = 0;
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] scores = new int[N];
			for (int i = 0; i < N; i++) {
				scores[i] = sc.nextInt();
			}
			Arrays.sort(scores);
			
			for (int i = 0; i < K; i++) {
				answer += scores[N - i - 1];
			}
			
			System.out.println("Case #" + test_case);
			System.out.println(answer);
		}
		sc.close();
	}
}
