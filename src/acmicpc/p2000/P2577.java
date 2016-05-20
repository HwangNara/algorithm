package acmicpc.p2000;

import java.util.Scanner;

public class P2577 {
	
	static int[] nums = new int[10];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int temp = A * B * C;
		while (temp > 0) {
			nums[temp % 10]++;
			temp /= 10;
		}
		for (int n : nums) System.out.println(n);
		sc.close();
	}
}
