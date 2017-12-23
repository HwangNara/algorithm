package acmicpc.p11000;

import java.util.Scanner;

public class P11816 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int size = n.length();
		int answer = 0;
		int temp = 0;
		if (n.charAt(0) == '0') {
			if (n.charAt(1) == 'x') { // 16진수
				for (int i = 0; i < size - 2; i++) {
					temp = n.charAt(size - i - 1);
					if (temp >= 97) { // a 이상
						temp -= 87;
					} else {
						temp -= 48;
					}
					answer += (int) Math.pow(16, i) * temp;
				}
			} else { // 8진수
				for (int i = 0; i < size - 1; i++) {
					answer += (int) Math.pow(8, i) * (n.charAt(size - i - 1) - 48);
				}
			}
		} else { // 10진수
			answer = Integer.parseInt(n);
		}
		System.out.println(answer);
		sc.close();
	}
}
