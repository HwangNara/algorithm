package acmicpc.p10000;

import java.util.Scanner;

public class P10953 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] temp;
		for (int i = 0; i < N; i++) {
			temp = sc.nextLine().split(",");
			System.out.println(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]));
		}
		sc.close();
	}
}
