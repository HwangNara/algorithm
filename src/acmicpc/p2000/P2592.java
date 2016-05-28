package acmicpc.p2000;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P2592 {

	static Map<Integer, Integer> freq = new HashMap<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = 10;
		int temp = 0;
		int[] nums = new int[N];
		int avg = 0;
		int best = 0;
		int answer = 0;
		Integer val;
		for (int i = 0; i < N; i++) {
			temp = sc.nextInt();
			nums[i] = temp;
			val = freq.get(temp);
			freq.put(temp, val == null ? 1 : val + 1); 
		}
		
		for (int i : nums) avg += i;
		avg /= 10;
		
		for (int key : freq.keySet()) {
			val = freq.get(key);
			if (val > best) {
				best = val;
				answer = key;
			}
		}
		
		System.out.println(avg + "\n" + answer);
		sc.close();
	}
}
