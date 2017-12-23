package acmicpc.p12000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P12788 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] pencilCase = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int needPenNum = Integer.parseInt(st.nextToken()) 
							* Integer.parseInt(st.nextToken());
		int answer = 0;
		boolean canBorrow = false;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			pencilCase[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(pencilCase);
		
		for (int i = pencilCase.length - 1; i >= 0; i--) {
			needPenNum -= pencilCase[i];
			answer++;
			if (needPenNum <= 0) {
				canBorrow = true;
				break;
			}
		}
		System.out.println(canBorrow ? answer : "STRESS");
	}
}
