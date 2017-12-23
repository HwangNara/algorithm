package acmicpc.p11000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P11653 {

	static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 2; i <= N; i++) {
			if (N % i == 0) {
				list.add(i);
				N /= i;
				i = 1;
			}
		}
		
		for (int n : list) {
			System.out.println(n);
		}
		
		sc.close();
	}
}
