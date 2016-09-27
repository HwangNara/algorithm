package acmicpc.p12000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12778 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int testCase = 0; testCase < T; testCase++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			char CorN = st.nextToken().charAt(0);
			
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < M; i++) {
				String tmp = st.nextToken();
				int a;
				if (CorN == 'C') {
					a = tmp.charAt(0) - 'A' + 1;
					System.out.printf("%d ", a);
				} else {
					a = Integer.parseInt(tmp) + 'A' - 1;
					System.out.printf("%c ", (char)a);
				}
			}
			System.out.println();
		}
		
	}
}
