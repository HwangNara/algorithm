package acmicpc.p2000;

import java.util.Scanner;

public class P2908 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		boolean aIsBig = true;
		int a = 0;
		int b = 0;
		for (int i = arr[0].length() - 1; i >= 0; i--) {
			a = arr[0].charAt(i) - 48;
			b = arr[1].charAt(i) - 48;
			
			if (a == b) continue;
			aIsBig = a > b ? true : false;
			break;
		}
		System.out.println(new StringBuffer(arr[aIsBig ? 0 : 1]).reverse());
		sc.close();
	}
}
