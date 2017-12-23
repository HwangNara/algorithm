package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1280 {
	
	static int mod = 1000000007;

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long[] loc = new long[N];
		long answer = 1;
		
		loc[0] = Long.parseLong(br.readLine());
		for (int i = 1; i < N; i++) {
			loc[i] = Long.parseLong(br.readLine());
			long temp = 0;
			for (int j = 0; j < i; j++) {
				temp += (loc[i] - loc[j]) % mod;
			}
			answer *= temp;
			answer %= mod;
		}
		
		System.out.println(answer);
	}
}
