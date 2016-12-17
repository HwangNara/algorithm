package acmicpc.p1000;

import java.util.Scanner;

public class P1002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long answer = 0;
		long x1, y1, r1, x2, y2, r2;
		long smallR, bigR;
		double d, r;
		
		for (int i = 0; i < T; i++) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			r1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			r2 = sc.nextInt();
			d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 -y2) * (y1 - y2));
			r = r1 + r2;
			
			if (r1 == 0 || r2 == 0) {
				answer = 0;
			} else if (d == 0) {
				answer = r1 == r2 ? -1 : 0;
			} else if (r > d) {
				smallR = Math.min(r1, r2);
				bigR = Math.max(r1, r2);
				if (smallR + d == bigR) {
					answer = 1;
				} else if (smallR + d < bigR) {
					answer = 0;
				} else {
					answer = 2;
				}
			} else if (r == d) {
				answer =1;
			} else {
				answer = 0;
			}
			System.out.println(answer);
		}
		sc.close();
	}
}
