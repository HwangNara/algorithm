package acmicpc.p7000;

import java.util.Scanner;

public class P7572 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt() % 60;
		System.out.print((char)(year % 12 + (year % 12 >= 4 ? 61 : 73)) + "" + (year % 10 + (year % 10 > 3 ? - 4 : 6)));
		sc.close();
	}
}