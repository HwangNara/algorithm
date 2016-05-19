package acmicpc.p1000;

import java.util.Arrays;
import java.util.Scanner;

public class P1157 {
	
	static int[] cnt = new int[26];
	static int answer = -1;
	static int size;
	static int temp = 0;
	static int max = -1;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int size = str.length();
		for (int i = 0; i < size; i++) {
			temp = str.charAt(i);
			if (temp >= 97) {
				cnt[temp - 97]++;
			} else {
				cnt[temp - 65]++;
			}
		}
		
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] > max) {
				max = cnt[i];
				answer = i;
			}
		}
		
		Arrays.sort(cnt);
		if (cnt[24] == cnt[25]) {
			System.out.println("?");
		} else {
			System.out.println((char) (answer + 65));
		}
		sc.close();
	}
}
