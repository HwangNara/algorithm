package acmicpc.p11000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11720 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int ans = 0;
		for (int i = 0; i < N; i++) {
			ans += Integer.parseInt(num.charAt(i) + "");
		}
		System.out.println(ans);
	}
}
