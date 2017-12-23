package acmicpc.p2000;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P2526 {

	static int cnt = 0;
	static int N;
	static int P;
	static int value;
	static Map<Integer, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		P = sc.nextInt();
		go();
		sc.close();
	}

	private static void go() {
		value = (cnt++ != 0) ? (value * N % P) : N;
		if (map.get(value) == null) {
			map.put(value, cnt);
		} else {
			System.out.println(cnt - map.get(value));
			return;
		}
		go();
	}
}
