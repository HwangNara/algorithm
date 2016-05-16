// TODO 좀 더 노가다 필요. 했으나 70%에서 오답!?
package acmicpc.p10000;

import java.math.BigInteger;
import java.util.Scanner;

public class P10827 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		String a = arr[0];
		int b = Integer.parseInt(arr[1]);
		int multy = 0;
		int zeroCount = 0;
		
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '.') {
				multy =  b * (a.length() - i - 1);
				break;
			}
		}
		
		String[] forA = a.split("\\.");
		String decimal = forA[0] + (forA.length == 2 ? forA[1] : "");
		BigInteger bi = new BigInteger(decimal);
		BigInteger result = new BigInteger(decimal);
		for (int i = 1; i < b; i++) {
			result = result.multiply(bi);
		}
		
		// 정수부가 0인 경우
		if (forA[0].equals("0")) {
			zeroCount++;
			for (int i = 0; i < forA[1].length(); i++) {
				if (forA[1].charAt(i) == '0') {
					zeroCount++;
					continue;
				}
				break;
			}
			
			zeroCount *= b;
			for (int i = 0; i < zeroCount; i++) {
				if (i == 1) System.out.print(".");
				System.out.print("0");
			}
		}
		
		// 일반적인 경우
		String resultString = result.toString();
		for (int i = 0; i < resultString.length(); i++) {
			if (i == resultString.length() - multy) {
				System.out.print(".");
			}
			System.out.print(resultString.charAt(i));
		}
		sc.close();
	}
}
