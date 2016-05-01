package acmicpc.p1000;

import java.util.Arrays;
import java.util.Scanner;

public class P1026 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] A = new int[T];
		int[] B = new int[T];
		int result = 0;
		int bTemp = 0;
		
		for (int i = 0; i < T; i++) A[i] = sc.nextInt();
		for (int i = 0; i < T; i++) B[i] = sc.nextInt();
		
		Arrays.sort(A);
		Arrays.sort(B);
		
		for (int i = 0; i < B.length / 2; i++) {
			bTemp = B[i];
			B[i] = B[B.length - 1 - i];
			B[B.length - 1 - i] = bTemp;
		}
		
		for (int i = 0; i < T; i++)	result += A[i] * B[i];
		
		System.out.println(result);
		sc.close();
	}

}
