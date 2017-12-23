package acmicpc.p1000;

import java.util.Scanner;

public class P1924 {
	
	static String[] answer = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	static int answerIndex = 0; // MON
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		int day = sc.nextInt();

		for (int i = 1; i <= month - 1; i++) {
			switch (i) {
			case 4:
			case 6:
			case 9:
			case 11:
				answerIndex += 30;
				break;
			case 2:
				answerIndex += 28;
				break;
			default:
				answerIndex += 31;
				break;
			}
		}
		
		answerIndex += day;
		
		answerIndex %= 7;
		
		System.out.println(answer[answerIndex]);
		
		sc.close();
	}
}
