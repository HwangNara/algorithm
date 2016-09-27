package acmicpc.p12000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P12780 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String H = br.readLine();
		String N = br.readLine();
		int hSize = H.length();
		int nSize = N.length();
		int answer = 0;
		
		loop:for (int i = 0; i < hSize - nSize + 1; i++) {
			if (H.charAt(i) == N.charAt(0)) {
				for (int j = 0; j < nSize; j++) {
					if (H.charAt(i + j) != N.charAt(j)) continue loop;
				}
				answer++;
			}
		}
		System.out.println(answer);
	}
}
