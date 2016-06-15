package acmicpc.p2000;

import java.util.Scanner;

public class P2530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		int time = sc.nextInt();
		sc.close();
		
		hour += time / 3600;
		time %= 3600;
		min += time / 60;
		time %= 60;
		sec += time;
		
		min += sec / 60;
		sec %= 60;
		hour += min / 60;
		min %= 60;
		
		System.out.println(hour % 24 + " " + min % 60 + " " + sec % 60);
	}
}
