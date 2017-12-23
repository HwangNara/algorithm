package acmicpc.p10000;

import java.util.Scanner;

public class P10870 {

	static int N = 21;
	static int[] fibo = new int[N];
	
	public static void main(String[] args) {
		
		fibo[1] = 1;
		fibo[2] = 1;
		for (int i = 3; i < N; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println(fibo[sc.nextInt()]);
		sc.close();
	}
}
