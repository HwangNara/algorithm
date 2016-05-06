package acmicpc.p11000;

import java.util.Scanner;

public class P11944 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		String M = sc.next();
		int n = Integer.parseInt(N);
		int m = Integer.parseInt(M);
		StringBuffer sb = new StringBuffer("");
		
		for (int i = 0; i < n; i++) {
			sb.append(N);
		}
		
		if (m < ((int) Math.log10(n) + 1) * n){
			// M자리만 출력
			for (int i = 0; i < m; i++) {
				System.out.print(sb.charAt(i));
			}
		} else {
			// N을 N번 출력
			System.out.println(sb);
		}
		
		sc.close();
	}
}
