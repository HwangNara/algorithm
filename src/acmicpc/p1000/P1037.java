package acmicpc.p1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1037 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Long> subMulti = new ArrayList<>();

		
		for (int i = 0; i < N; i++) {
			subMulti.add((long) sc.nextInt());
		}
		Collections.sort(subMulti);
		Collections.reverse(subMulti);
		System.out.println(subMulti.get(0) * subMulti.get(N - 1));
		
		sc.close();
	}
}
