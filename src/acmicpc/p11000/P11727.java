package acmicpc.p11000;

import java.util.Scanner;

public class P11727 {

	static int  m = 10007;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] d = new int[n + 1];
		d[1] = 1;
		if (n >= 2) d[2] = 3;
		if (n >= 3) d[3] = 5;

		for (int i = 4; i <= n; i++) {
			d[i] = (d[i - 1] + 2 * d[i - 2]) % m;
		}
		
		System.out.println(d[n]);
		sc.close();
	}
}
