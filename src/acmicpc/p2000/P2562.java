package acmicpc.p2000;

import java.util.Scanner;

public class P2562 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = 9;
		int max = -1;
		int index = -1;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (num > max) {
				max = num;
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index + 1);
		sc.close();
	}
}
