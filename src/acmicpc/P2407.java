package acmicpc;

import java.math.BigInteger;
import java.util.Scanner;

public class P2407 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		fact(n).divide(fact(n - m).multiply(fact(m)));
		
		BigInteger up = fact(n);
		BigInteger down = fact(n - m).multiply(fact(m));
		System.out.println(up.divide(down));
		
		sc.close();
	}

	private static BigInteger fact(int n) {
		
		BigInteger N = new BigInteger(Integer.toString(n));
		
		if (n == 1) {
			return BigInteger.valueOf(1);
		}
		return N.multiply((fact(n - 1)));
	}
}
