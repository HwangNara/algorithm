package acmicpc.p10000;

import java.util.Scanner;

public class P10833 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int human, apple;
		int remain = 0;
		for (int i = 0; i < N; i++) {
			human = sc.nextInt();
			apple = sc.nextInt();
			remain += apple % human;
		}
		System.out.println(remain);
		sc.close();
	}
}
