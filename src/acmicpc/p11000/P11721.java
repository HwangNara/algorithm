package acmicpc.p11000;

import java.util.Scanner;

public class P11721 {

	static final int div = 10;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		int start = 0;
		int end = start + div;
		while (true) {
			
			if (end > str.length()) end = str.length();
			System.out.println(str.substring(start, end));	
			if (end == str.length()) break;
			start += div;
			end += div;
		}
	}
}
