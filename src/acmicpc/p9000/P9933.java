// TODO ÇÏ´Â Áß...
package acmicpc.p9000;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P9933 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		Set<String> set = new TreeSet<>();
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < N; i++) {
			sb.setLength(0);
			sb.append(sc.nextLine());
			if (sb.reverse().toString().equals(sb.toString())) break;
			if (set.contains(sb.toString())) break;
			set.add(sb.reverse().toString());
		}
		
		System.out.println(sb.length() + " " + sb.charAt(sb.length() / 2));
		sc.close();
	}
}