package acmicpc.p1000;

import java.util.Scanner;

public class P1212 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int nSize = n.length();
		
		for (int i = 0; i < nSize; i++) {
			switch( n.charAt(i) ) {
			case '0' :
				System.out.print(i == 0 ? "" : "000");
				break;
			case '1' :
				System.out.print(i == 0 ? "1" : "001");
				break;
			case '2' :
				System.out.print(i == 0 ? "10" : "010");
				break;
			case '3' :
				System.out.print(i == 0 ? "11" : "011");
				break;
			case '4' :
				System.out.print("100");
				break;
			case '5' :
				System.out.print("101");
				break;
			case '6' :
				System.out.print("110");
				break;
			case '7' :
				System.out.print("111");
				break;
				
			}
		}
		
		
		
		
		sc.close();
	}
}
