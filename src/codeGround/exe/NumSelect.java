package codeGround.exe;

import java.util.Scanner;

public class NumSelect {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int testCase = 0;
		for (testCase = 1; testCase <= T; testCase++) {
			
			int answer = 0;
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				answer ^= sc.nextInt();
			}
			
			System.out.println("Case #" + testCase);
			System.out.println(answer);
		}
		sc.close();
	}
}
