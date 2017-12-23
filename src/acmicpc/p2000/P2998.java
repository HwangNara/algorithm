package acmicpc.p2000;

import java.util.Scanner;

public class P2998 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuffer bi = new StringBuffer(sc.nextLine());
		StringBuffer result = new StringBuffer();
		
		while (bi.length() % 3 != 0) {
			bi.insert(0, "0");
		}
		for (int i = 0; i < bi.length(); i += 3) {
			
			switch (bi.substring(i, i +3)) {
			case "000" : result.append("0"); break;
			case "001" : result.append("1"); break;
			case "010" : result.append("2"); break;
			case "011" : result.append("3"); break;
			case "100" : result.append("4"); break;
			case "101" : result.append("5"); break;
			case "110" : result.append("6"); break;
			case "111" : result.append("7"); break;
			}
			
		}
		System.out.println(result);
		sc.close();
	}
}
