package acmicpc.p8000;

import java.util.Scanner;

public class P8974 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int wholeIdx = 0;
		int number = 1;
		boolean goPlus = false;
		int sum = 0;
		loop: while (true) {
			for (int j = 0; j < number; j++) {
				goPlus = wholeIdx == a - 1 ? true : goPlus;
				if (wholeIdx == b) break loop;
				if (goPlus) sum += number;
				wholeIdx++;
			}
			number++;
		}
		System.out.println(sum);
	}
}
