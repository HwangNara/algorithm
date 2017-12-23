
package acmicpc.p2000;

import java.util.Scanner;

public class P2947 {

	static int dayNum = Week.Wednesday.ordinal();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int M = sc.nextInt();
		
		// ¿ù
		for (int month = 1; month < M; month++) {
			switch(month) {
			case 4 :
			case 6 :
			case 9 :
			case 11 :
				dayNum += 30;
				break;
			case 2 :
				dayNum += 28;
				break;
			default :
				dayNum += 31;
			}
		}
		// ÀÏ
		dayNum += D;
		
		System.out.println(Week.getString(dayNum % 7));
		sc.close();
	}
}

enum Week {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
	
	static String getString(int n) {
		return Week.values()[n].toString();
		
	}
}