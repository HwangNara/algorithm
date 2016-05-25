// TODO 왜 틀리지
package acmicpc.p7000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P7596 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		int N;
		int n = 1;
		
		while (true) {
			N = Integer.parseInt(sc.nextLine());
			if (N == 0) break;
			
			for (int i = 0; i < N; i++) list.add(sc.nextLine());
			
			Collections.sort(list, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					int length = o1.length() > o2.length() ? o2.length() : o1.length();
					for (int i = 0; i < length; i++) {
						char a = o1.charAt(i);
						char b = o2.charAt(i);
						
						if (a >= 97) a -= 32;
						if (b >= 97) b -= 32;
						if (a == b) continue;
						
						return a > b ? 1 : -1;
					}
					return o1.length() > o2.length() ? 1 : -1;
				}
			});
			System.out.println(n++);
			for (String str : list) {
				System.out.println(str);
			}
		}
		sc.close();
	}
}
