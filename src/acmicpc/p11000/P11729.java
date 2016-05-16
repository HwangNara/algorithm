// TODO 시간초과
package acmicpc.p11000;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P11729 {
	
	static int counter = 0;
	static List<String> list =  new LinkedList<>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		hanoi(N, 0, 2);
		System.out.println(counter);
		for (String s : list) {
			System.out.println(s);
		}
	}

	private static void hanoi(int n, int cur, int dest) {
		if (n == 1) {
			counter++;
			list.add(++cur + " " + ++dest);
			return;
		}
		int temp = 3 - (cur + dest);
		hanoi(n - 1, cur, temp);
		hanoi(1, cur, dest);
		hanoi(n - 1, temp, dest);
	}
}
