package acmicpc.p2000;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class P2607 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) - 1;
		int answer = 0;
		
		String std = br.readLine();
		boolean[] stdHave = new boolean[26];
		for (int i = 0; i < std.length(); i++) {
			stdHave[std.charAt(i) - 65] = true;
		}
		
		
		findAnswer  :for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			int size = temp.length();
			for (int j = 0; j < size; j++) {
				if (!stdHave[temp.charAt(j) - 65]) continue findAnswer;
			}
			answer++;
		}
		System.out.println(answer);
	}
}
