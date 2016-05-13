package acmicpc.p11000;

import java.util.Scanner;

public class P11945 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] N = sc.nextLine().split(" ");
		int n = Integer.parseInt(N[0]);
		String bung = "";
		
		if (Integer.parseInt(N[1]) == 0) {
			return;
		}
		
		for (int i = 0; i < n; i++) {
			bung = sc.nextLine();
			for (int j = bung.length() - 1; j >= 0; j--) {
				System.out.print(bung.charAt(j));
			}
			System.out.println();
		}
		
		sc.close();
	}
}
