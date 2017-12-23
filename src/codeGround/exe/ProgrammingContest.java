package codeGround.exe;

import java.util.Arrays;
import java.util.Scanner;

public class ProgrammingContest {

	static int answer;
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testCase = 1; testCase <= T; testCase++) {
			
			answer = 0;
			int N = sc.nextInt();
			int[] nums = new int[N];
			int[] compute = new int[N];
			int max = -1;
			for (int i = 0; i < N; i++) {
				nums[i] = sc.nextInt();
			}
			Arrays.sort(nums);
			
			for (int i = 0; i < compute.length; i++) {
				compute[i] = nums[i] + (N - i);
				if (compute[i] > max) max = compute[i];
			}
			
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] >= max - N) {
					answer++;
				}
			}
			
			System.out.println("Case #" + testCase);
			System.out.println(answer);
		}
		sc.close();
	}
}
