package acmicpc.p2000;

import java.util.Scanner;

public class P2566 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = 9;
		int temp = 0;
		int max = -1;
		int row = 0;
		int column = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				temp = sc.nextInt();
				if (temp > max ) {
					max = temp;
					row = i + 1;
					column = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(row + " " + column);
		sc.close();
	}
}
