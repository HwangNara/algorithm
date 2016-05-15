// TODO 시간초과... 왜?
package acmicpc.p11000;

import java.util.Scanner;

public class P11575 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());
		for (int testCase = 0; testCase < T; testCase++) {
			
			String[] temp = sc.nextLine().split(" ");
			long a = Integer.parseInt(temp[0]);
			long b = Integer.parseInt(temp[1]);
			String sentence = sc.nextLine();
			
			printPwSentence(a, b, sentence);
		}
		sc.close();
	}

	private static void printPwSentence(long a, long b, String sentence) {
		char[] cs = new char[sentence.length()];
		for (int i = 0; i < sentence.length(); i++) {
			cs[i] = ((char) (((a * (sentence.charAt(i) - 65) + b) % 26) + 65));
		}
		for (char c : cs) {
			System.out.print(c);
		}
		System.out.println();
	}
}
