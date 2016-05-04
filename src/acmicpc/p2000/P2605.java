package acmicpc.p2000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2605 {

	static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int order = 0;
		for (int i = 0; i < N; i++) {
			order = sc.nextInt();
			list.add(order, i + 1);
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i));
			if (i != 0) System.out.print(" ");
		}
		
		sc.close();
	}
}
