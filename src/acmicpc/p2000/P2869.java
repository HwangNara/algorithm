package acmicpc.p2000;

import java.util.Scanner;

public class P2869 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int up = sc.nextInt();
		int down = sc.nextInt();
		int distance = sc.nextInt();
		int day = 0;
		sc.close();
		
		if (up == distance) {
			System.out.println("1");
		} else {
			distance -= up;
			day++;
			day += distance / (up - down) + ((distance % (up - down) == 0 ? 0 : 1)); 
			System.out.println(day);
		}
	}
}
