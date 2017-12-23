package acmicpc.p9000;

import java.util.Scanner;

public class P9507 {
	
	// memoization을 위한 dp
	// recursive이지만 dp에 값이 있으면 메소드를 또 호출하지 않음
	static long[] dp;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		
		// dp를 위한 배열을 1개만 만들기 위해 가장 큰 사이즈의 배열을 생성
		dp = new long[max(nums) + 1];
		
		for (int i = 0; i < N; i++) {
			System.out.println(fibo(nums[i]));
		}
		sc.close();
	}

	private static int max(int[] nums) {
		int max = -1;
		for (int i : nums) {
			max = i > max ? i : max; 
		}
		return max;
	}

	private static long fibo(int n) {
		
		if (n < 2) return 1;
		if (n == 2) return 2;
		if (n == 3) return 4;
		
		long[] result = new long[4];
		for (int i = 1; i <= 4; i++) {
			if (dp[n - i] == 0) {
				dp[n - i] = fibo(n - i);
			}
			result[i - 1] = dp[n - i];
		}
		
		return result[0] + result[1] + result[2] + result[3];
	}
}
