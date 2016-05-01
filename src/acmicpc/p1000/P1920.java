package acmicpc.p1000;

import java.util.Arrays;
import java.util.Scanner;

public class P1920 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] Ns = new int[N];
		for (int i = 0; i < N; i++) {
			Ns[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int[] Ms = new int[M];
		for (int i = 0; i < M; i++) {
			Ms[i] = sc.nextInt();
		}
		
		Arrays.sort(Ns);

		int temp = 0;
		for (int i = 0; i < M; i++) {
			temp = Arrays.binarySearch(Ns, Ms[i]);
			if (temp < 0) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		}
		
		
		
		sc.close();
	}
}
