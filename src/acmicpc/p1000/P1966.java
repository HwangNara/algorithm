package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1966 {

	static int[] map;
	static int N, M;
	static int sp;
	static int ans;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int tc = 0; tc < T; tc++) {
			
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			map = new int[N];
			sp = 0;
			ans = 0;
					
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) map[i] = Integer.parseInt(st.nextToken()); 
			
			while (true) {
				if (isLargest()) {
					map[sp] = -1;
					ans++;
					if (sp == M) break;
				}
			}
			System.out.println(ans);
		}
	}

	private static boolean isLargest() {
		for (int i = sp + 1; i - sp < N; i++) {
			if (map[i % N] <= map[sp]) continue;
			sp++;
			sp %= N;
			return false;
		}
		return true;
	}
}
