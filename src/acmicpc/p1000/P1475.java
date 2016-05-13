package acmicpc.p1000;

import java.util.Scanner;

public class P1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int size = n.length();
		int[] nums = new int[10];
		int max = -1;
		int temp = 0;
		
		for (int i = 0; i < size; i++) {
			temp = n.charAt(i) - 48;
			if (temp == 6) {
 				nums[n.charAt(i) - 45]++;
 				continue;
 			} 
			nums[n.charAt(i) - 48]++;
		}
		
		nums[9] = (int) Math.ceil(((double) (nums[9]) / 2));
		
		for (int i : nums) {
			max = i > max ? i : max;
		}
		
		System.out.println(max);

		sc.close();
	}
}
