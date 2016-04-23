package acmicpc;

import java.util.Scanner;

public class P1267 {
	
	final static int Y = 0;
	final static int M = 1;
	static int[] fee = new int[2];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int time = 0;
		for (int i = 0; i < n; i++) {
			time = sc.nextInt();
			for (int j = 0; j < fee.length; j++) {
				fee[j] += getFee(j, time);
			}
		}
		
		if (fee[Y] > fee[M]) {
			System.out.println("M " + fee[M]);
		} else if (fee[M] > fee[Y]) {
			System.out.println("Y " + fee[Y]);
		} else {
			System.out.println("Y M " + fee[Y]);
		}
		
		sc.close();
	}

	private static int getFee(int telecom, int time) {
		
		int result = 0;
		
		switch (telecom) {
		case Y :
			result = 10 * ((time / 30) + 1);
			break;
		case M :
			result = 15 * ((time / 60) + 1);
			break;
		}
		return result;
	}
}
