package codeGround.scpc2015pre;

import java.util.Scanner;

public class EqualNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int jinsu = 0;
		int num = 0;
		int modVal = 0;
		int temp = 0;
		for (int i = 1; i <= T; i++) {
			num = sc.nextInt();
			jinsu = 0;
			
			// 2진수 체크
			if (Integer.toBinaryString(num).length() == Integer.bitCount(num)) {
				printAnswer(i, 2);
				continue;
			}
			
			// 3진수부터 체크
			label: for (int j = 3; j < num - 1; j++) {
				temp = num;
				modVal = temp % j;
				while (temp / j > 0) {
					if (temp % j != modVal) break;
					modVal = temp % j;
					temp /= j;
					
					if (temp / j == 0 && temp % j == modVal) {
						jinsu = j;
						break label;
					}
				}
			}
			
			// num - 1 전까지 다 돌아도 없으면
			if (jinsu == 0) jinsu = num - 1;
			
			printAnswer(i, jinsu);
			
		}
		sc.close();
	}

	private static void printAnswer(int i, int jinsu) {
		System.out.printf("Case #%d\n%d\n", i, jinsu);		
	}
}
