package acmicpc.p2000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P2576 {
	
	static List<Integer> odd = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = 7;
		int answer = 0;
		int temp = 0;
		for (int i = 0; i < N; i++) {
			temp = sc.nextInt();
			if ((temp & 1) == 1) odd.add(temp);
		}
		
		if (odd.isEmpty()) { 
			System.out.println("-1");
		} else {
			Collections.sort(odd);
			for (int num : odd) {
				answer += num;
			}
			System.out.println(answer + "\n" + odd.get(0));
		}
		sc.close();
	}
}
