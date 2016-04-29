package acmicpc.p11000;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P1978 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		int n = sc.nextInt();
		boolean isOk = false;
		for (int i = 0; i < n; i++) {
			isOk = isPrime(sc.nextInt());
			if (isOk) set.add(i);
		}
		System.out.println(set.size());
		sc.close();
	}

	private static boolean isPrime(int num) {
		
		if (num == 1) return false;
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
