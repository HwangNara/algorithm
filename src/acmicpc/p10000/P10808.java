package acmicpc.p10000;

import java.util.Scanner;

public class P10808 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int size = str.length();
		int[] cnt = new int[26];
		sc.close();
		
		for (int i = 0; i < size; i++) {
			cnt[str.charAt(i) - 97]++;
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(cnt[i]);
			if (i + 1 != 26) System.out.print(" ");
		}
	}
}
