package acmicpc.p1000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1661_DP {

	static List<Integer> S = new ArrayList<>();
	static List<Integer> V = new ArrayList<>();
	static int[] d;
	static int ANSWER = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		d = new int[N];
		int i = 0;
		
		S.add(0);
		V.add(0);
		while (N >= V.get(i) + S.get(i) + i + 1) {
			i++;
			S.add(S.get(i - 1) + i);
			V.add(S.get(i) + V.get(i - 1));
		}
		
		System.out.print(V + "\n");
		
		for (int j = V.size() - 1; j > 0; j--) {
			ANSWER += N / V.get(j);
			N %= V.get(j);
			
			if (N == 0) break;
		}
		
		System.out.println(ANSWER);
		sc.close();
	}
}
