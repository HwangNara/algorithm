package acmicpc.p9000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P9251 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		int sizeOfS1 = s1.length();
		int sizeOfS2 = s2.length();
		int[][] d = new int[sizeOfS1+1][sizeOfS2+1];
				
		for (int i = 1; i <= sizeOfS1; i++) {
			for (int j = 1; j <= sizeOfS2; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					d[i][j] = d[i-1][j-1] + 1;
				} else {
					d[i][j] = Math.max(d[i][j-1], d[i-1][j]);
				}
			}
		}
		System.out.println(d[sizeOfS1][sizeOfS2]);
	}
}
