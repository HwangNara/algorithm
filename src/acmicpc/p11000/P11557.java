package acmicpc.p11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11557 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
		int T = Integer.parseInt(br.readLine());
		
		for (int testCase = 1; testCase <= T; testCase++) {
			
			int n = Integer.parseInt(br.readLine());
			String answer = "";
			int maxNum = Integer.MIN_VALUE;
			
			for (int i = 0; i < n; i++) {
				String[] drink = br.readLine().split(" ");
				int cnt = Integer.parseInt(drink[1]); 
				if (cnt > maxNum) {
					maxNum = cnt;
					answer = drink[0];
				}
			}
			System.out.println(answer);
		}
	}
}
