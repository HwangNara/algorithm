package acmicpc.p1000;

import java.util.Scanner;

public class P1032 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		boolean[] check = new boolean[50];  
		
		String standard = sc.nextLine();
		int size = standard.length();
		
		String temp = null;
		for (int i = 1; i < N; i++) {
			
			temp = sc.nextLine();
			for (int j = 0; j < size; j++) {
				if (temp.charAt(j) == '?') {
					continue;
				}
				if (temp.charAt(j) != standard.charAt(j)) {
					check[j] = true;
				}
			}
		}
		
		for (int i = 0; i < size; i++) {
			System.out.print(check[i] ? "?" : standard.charAt(i));
		}
		
		sc.close();
	}
}
