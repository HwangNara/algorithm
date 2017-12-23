package acmicpc.p1000;

import java.util.Scanner;

public class P1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String row = sc.nextLine();
		row = row.trim();
		if (row.equals("")) {
			System.out.println("0");
		} else {
			String[] s = row.split(" ");
			System.out.println(s.length);
		}
		sc.close();
	}
}
