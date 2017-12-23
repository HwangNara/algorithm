package acmicpc.p2000;

import java.util.Scanner;

public class P2864 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		String tempA;
		String tempB;
		
		// 최소 값
		tempA = getMinString(a);
		tempB = getMinString(b);
		System.out.print(Integer.parseInt(tempA) + Integer.parseInt(tempB) + " ");

		// 최대 값
		tempA = getMaxString(a);
		tempB = getMaxString(b);
		System.out.print(Integer.parseInt(tempA) + Integer.parseInt(tempB));
		
		
		sc.close();
	}

	private static String getMinString(String a) {
		String temp = "";
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (c == '6') {
				temp += '5';
			} else {
				temp += c;
			}
		}
		return temp;
	}

	private static String getMaxString(String a) {
		String temp = "";
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (c == '5') {
				temp += '6';
			} else {
				temp += c;
			}
		}
		return temp;
	}
}
