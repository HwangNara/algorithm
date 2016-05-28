package acmicpc.p2000;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P2476 {
	
	static int DICE = 3;
	static Map<Integer, Integer> nums = new TreeMap<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int key = 0;
		int value = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			nums.clear();
			for (int j = 0; j < DICE; j++) {
				key = sc.nextInt();
				if (nums.get(key) == null) {
					nums.put(key, 1);
				} else {
					nums.put(key, nums.get(key) + 1);
				}
			}
			switch(nums.size()) {
			case 1 :
				for (int k : nums.keySet()) {
					value = 10000 + 1000 * k;
				}
				break;
			case 2 :
				for (int k : nums.keySet()) {
					if (nums.get(k) == 2) {
						value = 1000 + 100 * k;
					}
				}
				break;
			case 3 :
				for (int k : nums.keySet()) {
					value = 100 * k;
				}
				break;
			}
			max = value > max ? value : max;
		}
		System.out.println(max);
		sc.close();
	}
}
