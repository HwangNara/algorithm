package acmicpc.p5000;

import java.util.Scanner;

public class P5532 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int guk = sc.nextInt();
		int math = sc.nextInt();
		int gukPerDay = sc.nextInt();
		int mathPerDay = sc.nextInt();
		
		guk = guk % gukPerDay == 0 ? guk / gukPerDay : guk / gukPerDay + 1;
		math = math % mathPerDay == 0 ? math / mathPerDay : math / mathPerDay + 1;
		System.out.println(L - (guk > math ? guk : math));
		sc.close();
	}
}
