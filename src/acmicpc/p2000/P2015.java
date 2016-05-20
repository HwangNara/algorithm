// TODO 시간초과 --> 80%에서 틀림
package acmicpc.p2000;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P2015 {

	static Map<Long, Long> map = new HashMap<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long accum = 0;
		int count = 0;
		Long target;
		Long freq;
		
		map.put(0L, 1L);
		for (int n = 0; n < N; n++) {
			accum += sc.nextLong();
			target = accum - K;
			freq = map.get(target);
			count += freq == null ? 0 : freq;
			
			if (map.get(accum) == null) {
				map.put(accum, 1L);
			} else {
				map.put(accum, map.get(accum) + 1);
			}
			System.out.println(map + ", " + freq);
		}

		System.out.println(count);
		sc.close();
	}
}
