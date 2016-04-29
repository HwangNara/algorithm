package acmicpc.p11000;

import java.util.Scanner;

public class P2920 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isAsc = true;
		boolean isBeforeAsc = true;
		int[] values = new int[8];
		for (int i = 0; i < 8; i++) values[i] = sc.nextInt();
		
		isBeforeAsc = values[1] - values[0] > 0 ? true : false;
		for (int i = 2; i < 8; i++) {
			isAsc = values[i] > values[i - 1] ? true : false;
			if (isAsc == !isBeforeAsc) break;
			isBeforeAsc = isAsc;
		}
		
		if (isAsc != isBeforeAsc) {
			System.out.println("mixed");
		} else if (isAsc) {
			System.out.println("ascending");
		} else {
			System.out.println("descending");
		}
		
		sc.close();
	}
}
