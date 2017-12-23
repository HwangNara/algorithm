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
		int[] stdHave = new int[26];
		for (int i = 0; i < std.length(); i++) {
			stdHave[std.charAt(i) - 65]++;
		}
		
		
		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			int size = temp.length();
			int[] tempHave = new int[26];
			int check = 0;
			
			for (int j = 0; j < size; j++) {
				tempHave[temp.charAt(j) - 65]++;
			}
			
			for (int j = 0; j < tempHave.length; j++) {
				if (stdHave[j] - tempHave[j] != 0) {
					check++;
				}
			}
			if (check < 2) answer++;
			if (check == 2 && std.length() == temp.length()) answer++;
		}
		System.out.println(answer);
	}
}
