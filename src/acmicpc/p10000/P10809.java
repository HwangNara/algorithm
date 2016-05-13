package acmicpc.p10000;

import java.util.Arrays;
import java.util.Scanner;

public class P10809 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int[] alpha = new int[26];
		Arrays.fill(alpha, -1);
		
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i) - 97;
			if (alpha[c] == -1) alpha[c] = i;
		}
		
		for (int i : alpha) System.out.printf("%d ", i);
		sc.close();
	}
}
