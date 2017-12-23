package acmicpc.p1000;

import java.util.Scanner;

public class P1085 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int horizontal = x > w - x ? w - x : x; 
		int vertical = y > h - y ? h - y : y;
		System.out.println(horizontal > vertical ? vertical : horizontal);
		
		sc.close();
	}
}
