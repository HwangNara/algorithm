package acmicpc;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P2750 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		Set<Integer> set = new TreeSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			set.add(sc.nextInt());
		}
		for (int n : set) System.out.println(n);
		
		sc.close();
		
	}
}