package acmicpc.p10000;

import java.util.Scanner;

public class P10102 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String vote = sc.next();
		sc.close();
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < N; i++) {
			switch (vote.charAt(i)) {
			case 'A' : a++; break;
			case 'B' : b++; break;
			}
		}
		System.out.println(a > b ? "A" : (a < b ? "B" : "Tie"));
	}
}
