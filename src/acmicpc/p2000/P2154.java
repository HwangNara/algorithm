package acmicpc.p2000;

import java.util.Scanner;

public class P2154 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i <= 1000; i++) {
			sb.append(Integer.toString(i));
		}
		System.out.println(sb);
		
		int a = 0;
		for (int i = 1; i < 20; i++) {
			if (i == 10) {
				a += 20; 
			} else {
				a += i;
				
			}
		}
		System.out.println(a);
		sc.close();
	}
}
