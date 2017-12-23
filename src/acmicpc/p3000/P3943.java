package acmicpc.p3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3943 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int testCase = 1; testCase <= T; testCase++) {
			
			int n = Integer.parseInt(br.readLine());
			int maxValue = 1;
			while (true) {
				if (n == 1) break;
				if (n > maxValue) maxValue = n;
				n = (n & 1) == 1 ? 3 * n + 1 : n / 2;
			}
			System.out.println(maxValue);
		}
	}
}
