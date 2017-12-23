package acmicpc.p9000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P9506 {

	static List<Integer> nums = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while ((n = sc.nextInt()) > 0) {
			int match = 0;
			nums.clear();
			nums.add(1);

			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					nums.add(i);
					nums.add(n / i);
				}
			}
			
			for (int i : nums) match += i;
			
			if (match == n) {
				Collections.sort(nums);
				System.out.print(n + " = ");
				int size = nums.size();
				for (int i = 0; i < size; i++) {
					System.out.print(nums.get(i));
					if (i + 1 != size) {
						System.out.print(" + ");
					}  else {
						System.out.println();
					}
				}
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}
		
		sc.close();
	}
}
