package acmicpc.p9000;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P9461 {

	static long[] P;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input_sample/acm_9461.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n = 0;
		for (int i = 0; i < T; i++) {
			n = sc.nextInt();
			if (n <= 10) {
				allocAndInit(10);
				System.out.println(P[n]);
				continue; 
			}
			allocAndInit(n);
			
			// bottom up
			for (int j = 11; j <= n; j++) {
				P[j] = P[j - 1] + P[j - 5];
			}
			
			System.out.println(P[n]);
		}
		sc.close();
	}

	private static void allocAndInit(int n) {
		P = new long[n + 1];
		init(P);
	}

	private static void init(long[] P) {
		P[1] = 1; P[2] = 1; P[3] = 1; P[4] = 2; P[5] = 2;
		P[6] = 3; P[7] = 4; P[8] = 5; P[9] = 7; P[10] = 9;
	}
}
