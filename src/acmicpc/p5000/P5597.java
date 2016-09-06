package acmicpc.p5000;

import java.util.Scanner;

public class P5597 {

	static boolean[] check = new boolean[31];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 28; i++) {
			check[sc.nextInt()] = true;
		}
		
		for (int i = 1; i < check.length; i++) {
			if (check[i] == false) System.out.println(i);
		}
		sc.close();
	}
}
