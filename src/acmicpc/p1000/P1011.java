// TODO 시간초과

package acmicpc.p1000;

import java.util.Scanner;

public class P1011 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d = 0;
		for (int i = 0; i < N; i++) {
			d = Math.abs(sc.nextInt() - sc.nextInt());
			int n = 0;
			int cnt = 1;
			int sum = 0;
			boolean flag = true;
			while (true) {
				if (flag) n++;
				sum += n;
				if (d <= sum) {
					break;
				}
				cnt++;
				flag = !flag;
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}
