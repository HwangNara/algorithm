package acmicpc.p2000;

import java.util.Scanner;

public class P2953 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] grades = new int[5][4];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				grades[i][j] = sc.nextInt();
			}
		}
		
		int order = 0;
		int value = -1;
		int temp = 0;
		for (int i = 0; i < 5; i++) {
			
			temp = 0;
			for (int j = 0; j < 4; j++) {
				temp += grades[i][j];
			}
			
			if (temp > value) {
				value = temp;
				order = i + 1;
			}
		}
		
		System.out.println(order +" " + value);
		sc.close();
	}
}
