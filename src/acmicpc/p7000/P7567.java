package acmicpc.p7000;

import java.util.Scanner;

public class P7567 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String bowl = sc.nextLine();
		int answer = 10;
		for (int i = 1; i < bowl.length(); i++) {
			if (bowl.charAt(i) == bowl.charAt(i - 1)) {
				answer += 5;
			} else {
				answer += 10;
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
