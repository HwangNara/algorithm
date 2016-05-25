package acmicpc.p7000;

import java.util.Scanner;

public class P7600 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		while (true) {
			if ((line = sc.nextLine()).equals("#")) break;
			int size = line.length();
			boolean[] alphabet = new boolean[26];
			int cnt = 0;
			for (int i = 0; i < size; i++) {
				int c = line.charAt(i);
				if (c < 65 || c > 122) continue;
				alphabet[c - (c >= 97 ? 97 : 65)] = true;
			}
			for (boolean b : alphabet) if (b) cnt++;
			System.out.println(cnt);
		}
		sc.close();
	}
}
