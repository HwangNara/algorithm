package acmicpc.p3000;

import java.util.Arrays;
import java.util.Scanner;

public class P3047 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = 3;
		int[] nums = new int[N];
		int[] answers = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(sc.next());
		}
		String alpha = sc.next();
		
		Arrays.sort(nums);
		
		for (int i = 0; i < alpha.length(); i++) {
			char c = alpha.charAt(i);
			switch (c) {
			case 'A' : answers[i] = nums[0]; 
				break;
			case 'B' : answers[i] = nums[1];
				break;
			case 'C' : answers[i] = nums[2];
				break;
			}
		}
		System.out.printf("%d %d %d", answers[0], answers[1], answers[2]);
		sc.close();
	}
}
