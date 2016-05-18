package acmicpc.p1000;

import java.util.Scanner;

public class P1076 {
	
	static String[] words = 
		{ "black", "brown", "red", "orange", "yellow", 
		  "green", "blue", "violet", "grey", "white" };

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long sip = transNum(sc.nextLine(), true);
		long il = transNum(sc.nextLine(), true);
		long gop = transNum(sc.nextLine(), false);
		System.out.println((sip * 10 + il) * gop);
		sc.close();
	}

	private static long transNum(String s, boolean isValue) {
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(s)) {
				
				if (isValue) {
					return i;
				}
				return (int)Math.pow(10, i);
			}
		}
		return -1;
	}
}
