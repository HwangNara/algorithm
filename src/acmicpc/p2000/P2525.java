package acmicpc.p2000;

import java.util.Scanner;

public class P2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		
		min = time + min;
		hour += min / 60;
		min %= 60;
		
		System.out.println((hour % 24) + " " + min);
		sc.close();
	}
}
