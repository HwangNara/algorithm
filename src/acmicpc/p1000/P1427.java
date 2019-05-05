package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();

		int[] counting = new int[10];
		for (int i = 0; i < N.length(); i++) {
		    counting[N.charAt(i) - '0']++;
        }

		StringBuilder sb = new StringBuilder();
		for (int i = 9; i >= 0; i--) {
		    for (int j = 0; j < counting[i]; j++) {
		        sb.append(i);
            }
        }
        System.out.println(sb);
	}
}
