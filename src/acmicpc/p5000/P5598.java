package acmicpc.p5000;

import java.util.Scanner;

public class P5598 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String pw = sc.nextLine();
		char[] ans = new char[pw.length()];
		char temp;
		for (int i = 0; i < pw.length(); i++) {
			temp = (char) (pw.charAt(i) - 3);
			if (temp < 'A') temp += 26;
			ans[i] = temp;
		}
		System.out.println(ans);
		sc.close();
	}
}