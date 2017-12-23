package acmicpc.p11000;

import java.util.Scanner;

public class P11943 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int o1 = sc.nextInt();
		int a2 = sc.nextInt();
		int o2 = sc.nextInt();
		
		System.out.println(a1 + o2 > a2 + o1 ? a2 + o1 : a1 + o2);
		
		
		sc.close();
	}
}
