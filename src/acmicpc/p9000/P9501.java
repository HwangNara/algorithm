package acmicpc.p9000;

import java.util.Scanner;

public class P9501 {
	
	static int[] cars = new int[3];
	static int VELOCITY = 0;
	static int FUEL = 1;
	static int COST_PER = 2;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		for (int index = 0; index < test_case; index++) {

			int cnt = 0;
			int n = sc.nextInt();
			int dist = sc.nextInt();
			int result = 0;
			for (int i = 0; i < n; i++) {
				cars[VELOCITY] = sc.nextInt();
				cars[FUEL] = sc.nextInt();
				cars[COST_PER] = sc.nextInt();
				result = (int)(((double) cars[VELOCITY] / cars[COST_PER]) * cars[FUEL]);
				if (result >= dist) cnt++;
			}
			
			System.out.println(cnt);
		}
		sc.close();
	}
}
