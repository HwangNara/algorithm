package acmicpc.p2000;

import java.util.Scanner;

public class P2455 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int temp = 0;
		
		for (int i = 0; i < 4; i++) {
			temp = answer - sc.nextInt() + sc.nextInt();
			answer = temp > answer ? temp : answer; 
		}
		
		System.out.println(answer);
		sc.close();
	}
}
