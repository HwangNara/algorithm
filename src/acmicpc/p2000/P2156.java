package acmicpc.p2000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2156 {
	
	static long[] d;
	static int[] a;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		d = new long[n + 1];
		a = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		d[1] = a[1];
		if (n >= 2) d[2] = a[1] + a[2];
		
		for (int i = 3; i <= n; i++) {
			d[i] = Math.max(Math.max(d[i - 1], d[i - 2] + a[i]), d[i - 3] + a[i] + a[i - 1]);
		}
		
		System.out.println(d[n]);
	}
}
