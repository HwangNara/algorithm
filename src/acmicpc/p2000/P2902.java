package acmicpc.p2000;

import java.util.Scanner;

public class P2902 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for (String s : sc.nextLine().split("-")) {
			System.out.print(s.charAt(0));
		}
		sc.close();
	}
}
