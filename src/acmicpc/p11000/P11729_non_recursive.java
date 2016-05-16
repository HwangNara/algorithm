// TODO 시간초과
package acmicpc.p11000;

import java.util.Scanner;

public class P11729_non_recursive {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		System.out.println((int)Math.pow(2, N) - 1);
		for (int x = 1; x < (1 << N); x++) {
			System.out.println(((x&x-1)%3+1) + " " + (((x|x-1)+1)%3+1));
		}
	}
}
