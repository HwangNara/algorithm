package acmicpc.p10000;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P10826 {

	static int N = 10001;
	static List<BigInteger> fibo = new ArrayList<>();  
	
	
	public static void main(String[] args) {

		fibo.add(new BigInteger("0"));
		fibo.add(new BigInteger("1"));

		for (int i = 2; i < N; i++) {
			fibo.add(fibo.get(i - 1).add(fibo.get(i - 2)));
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println(fibo.get(sc.nextInt()));
		sc.close();
	}
}
