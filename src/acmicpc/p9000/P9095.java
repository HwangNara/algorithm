package acmicpc.p9000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9095 {
	
	static int[] D = new int[11];

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		D[0] = 0;
		D[1] = 1;
		D[2] = 2;
		D[3] = 4;
		for (int i = 4; i < 11; i++) {
			D[i] = D[i - 1] + D[i - 2] + D[i - 3];
		}
		
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(D[n]);
		}
		br.close();
	}
	
	
}
