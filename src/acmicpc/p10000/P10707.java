package acmicpc.p10000;

import java.util.Scanner;

public class P10707 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int xA = sc.nextInt();
		int yNormal = sc.nextInt();
		int yUpper = sc.nextInt();
		int yPerLitter = sc.nextInt();
		int water = sc.nextInt();
		
		int x = water * xA;
		int y = water <= yUpper ? yNormal : yNormal + yPerLitter * (water - yUpper);
		System.out.println(x > y ? y : x);
		
		sc.close();
	}
}
