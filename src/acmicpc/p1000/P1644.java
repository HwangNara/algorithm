// TODO 시간 초과
package acmicpc.p1000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1644 {
	
	static List<Integer> primes = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// N까지 소수들 구함
		getPrimeToN(N);
		
		// 갯수 구함
		int size = primes.size();
		int cnt = 0;
		int answer = 0;
		for (int i = 0; i < size; i++) {
			answer = 0;
			for (int j = i; j < size; j++) {
				answer += primes.get(j);
				if (answer == N) {
					cnt++;
					break;
				}
				if (answer > N) break;
			}
		}
		System.out.println(cnt);
		sc.close();
	}

	private static void getPrimeToN(int N) {
		int limit = 0;
		primes.add(2);
		primes.add(3);
		
		for (int n = 4; n <= N; n++) {
			if ((n & 1) != 0) { // 홀수만 검사해봄
				checkPrime(n, limit);
			}
		}
		checkPrime(N, N);
		System.out.println("made Prime!");
//		System.out.println(primes);
	}

	private static void checkPrime(int n, int limit) {
		limit = (int) Math.sqrt(n);
		for (int divide = 2; divide <= limit; divide++) {
			if (n % divide == 0) break;
			if (limit == divide) primes.add(n);
		}		
	}
}
