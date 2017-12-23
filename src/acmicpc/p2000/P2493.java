package acmicpc.p2000;

import java.util.Scanner;

public class P2493 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] towers = new int[T];
		
		for (int i = 0; i < T; i++) {
			towers[i] = sc.nextInt();
		}
		
//		for (int i : towers) System.out.println(i);
		
		for (int index = 0; index < T; index++) {
			for (int position = index; position >= 0; position--) {
				
				if (position - 1 >= 0
					&& towers[position - 1] >= towers[index]) {
					System.out.print(position);
					if (index < T - 1) System.out.print(" ");
					break;
				}

				if (position == 0) {
					System.out.print("0");
					if (index < T - 1) System.out.print(" ");
					break;
				}
			}
		}
		
		
		
		
		sc.close();
	}
}
