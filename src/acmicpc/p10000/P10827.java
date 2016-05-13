// TODO 좀 더 노가다 필요
package acmicpc.p10000;

import java.math.BigInteger;
import java.util.Scanner;

public class P10827 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		String a = arr[0];
		int b = Integer.parseInt(arr[1]);
		@SuppressWarnings("unused")
		int multy = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '.') {
				multy = a.length() - i - 1;
				break;
			}
		}
		
		String[] forA = a.split("\\.");
		
		BigInteger bi = new BigInteger(forA[0] + forA[1]);
		BigInteger result = new BigInteger(forA[0] + forA[1]);
		for (int i = 1; i < b; i++) {
			result = result.multiply(bi);
		}
		System.out.println(result);
		sc.close();
	}
}
