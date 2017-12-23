package acmicpc.p1000;

import java.util.Scanner;

public class P1292 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int answer = 0;
		int i = 1;
		int counter = 0;
		loop: while (true) {
			for (int j = 1; j <= i; j++) {
				counter++;
				if (counter >= A) answer += i;
				if (counter == B) break loop;
			}
			i++;
		}
		System.out.println(answer);
	}
}
