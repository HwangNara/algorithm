package acmicpc.p5000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5026 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int testCase = 0; testCase < T; testCase++) {
			String[] tokens = br.readLine().split("\\+");
			if (tokens.length != 2) {
				System.out.println("skipped");
				continue;
			}
			
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[1]);
			System.out.println(a + b);
		}
	}
}
