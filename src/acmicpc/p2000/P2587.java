package acmicpc.p2000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P2587 {

	static List<Integer> nums = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = 5;
		int temp = 0;
		int avg = 0;
		for (int i = 0; i < N; i++) {
			temp = sc.nextInt();
			avg += temp;
			nums.add(temp);
		}
		Collections.sort(nums);
		System.out.println(avg/5 + "\n" + nums.get(2));
		sc.close();
	}
}
