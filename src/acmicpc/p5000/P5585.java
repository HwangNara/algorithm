package acmicpc.p5000;

import java.util.Scanner;

public class P5585 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = 1000 - sc.nextInt();
		sc.close();
		int answer = 0;
		boolean nextFive = true;
		for (int i = 0, c = 500; i < 6; i++, nextFive = !nextFive) {
			answer += m / c;
			m %= c;
			c = nextFive ? c / 5 : c / 2;
		}
		System.out.println(answer);
	}
}
