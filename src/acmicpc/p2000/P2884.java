package acmicpc.p2000;

import java.util.Scanner;

public class P2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		m = m - 45;
		if (m < 0) {
			m += 60;
			h--;
		}
		h = h < 0 ? 23 : h;
		System.out.println(h + " " + m);
		sc.close();
	}
}
