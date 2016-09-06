package sds.pre;

import java.io.FileNotFoundException;
import java.util.Scanner;
//import java.util.StringTokenizer;

public class ToyCheck {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
//		System.setIn(new FileInputStream("input_sample/sds_toy_check.txt"));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(br.readLine().trim());
		
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[] toys = null;
		int[] answer = null;
		int[][] cost = null;
		
		for (int t = 1; t <= testCase; t++) {
			
			int toyNum = sc.nextInt();
			int kind = sc.nextInt();
			int cur = -1;
			int pre = -1;
			
			toys = new int[toyNum + 1];
			answer = new int[toyNum + 1];
			cost = new int[toyNum + 1][toyNum + 1];
			
			// 장난감 받으면서 answer 채움 
			for (int i = 1; i <= toyNum; i++) {
				toys[i] = sc.nextInt();
				cur = toys[i];
				answer[i] = answer[i - 1] + (cur == pre ? 0 : 1);
				pre = cur;
			}
			
			// cost 값 채우기
			for (int i = 1; i <= toyNum; i++) {
				boolean[] checker = new boolean[kind + 1];
				int count = 0;
				for (int j = i; j <= Math.min(i + 19, toyNum); j++) {
					if(!checker[toys[j]]) {
						count++;
						checker[toys[j]] = true;
					}
					cost[i][j] = count * count;
				}
			}
			
			// DP로 구하기
			for (int i = 1; i <= toyNum; i++) {
				for (int j = Math.max(1, i - 19); j <= i; j++) {
//					System.out.printf("answer[%d] = %d, answer[%d] + cost[%d][%d] = %d\n", i, answer[i], j - 1, j, i, cost[j][i]);
					answer[i] = Math.min(answer[i], answer[j - 1] + cost[j][i]);
				}
			}
			System.out.println("#" + t + " " + answer[toyNum]);
		}
		sc.close();
	}
}

/*
출력
#1 6
#2 14
*/