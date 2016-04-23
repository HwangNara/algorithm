package acmicpc;

import java.util.Scanner;

public class P1357 {

	static String stringX;
	static String stringY;
	static char[] revX;
	static char[] revY;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		stringX = Integer.toString(X);
		stringY = Integer.toString(Y);

		revX = getRev(stringX);
		revY = getRev(stringY);
		
		X = Integer.parseInt(new String(revX));
		Y = Integer.parseInt(new String(revY));
		
		System.out.println(Integer.parseInt(new String(getRev(Integer.toString(X + Y)))));
		
		sc.close();
	}

	private static char[] getRev(String string) {
		char[] rev = new char[string.length()];
		
		for (int i = 0; i <= string.length() / 2; i++) {
			rev[i] = string.charAt(string.length() - i - 1);
			rev[string.length() - i - 1] = string.charAt(i);
		}		
		
		return rev;
	}

}

