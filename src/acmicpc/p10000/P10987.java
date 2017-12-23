package acmicpc.p10000;

import java.util.Scanner;

public class P10987 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int size = str.length();
		int answer = 0;
		
		for (int i = 0; i < size; i++) {
			switch(str.charAt(i)) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				answer++;
			}
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
