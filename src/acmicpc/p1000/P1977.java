package acmicpc.p1000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1977 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		int min = 0;
		
		for (int i = (int) Math.ceil(Math.sqrt(m)); i <= (int)Math.sqrt(n); i++) {
			list.add(i * i);
		}
		
		if (list.size() == 0) {
			System.out.println("-1");
		} else {
			// 합 계산
			for (int num : list) sum += num;
			
			// 최소값
			Collections.sort(list);
			min = list.get(0);
			
			System.out.println(sum);
			System.out.println(min);
		}
		sc.close();
	}
}
