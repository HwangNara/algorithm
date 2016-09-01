package sds.pre;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ToyCheck {
	
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int a = Integer.parseInt(st.nextToken());
//		int b = Integer.parseInt(br.readLine().trim());
		
		System.setIn(new FileInputStream("input_sample/sds_toy_check.txt"));
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int[] toys = null;
		int[] answer = null;
		int[][] cost = null;
		
		for (int i = 0; i < testCase; i++) {
			
			int toyNum = sc.nextInt();
			int kind = sc.nextInt();
			int cur = -1;
			int pre = -1;
			
			toys = new int[toyNum];
			answer = new int[toyNum];
			cost = new int[toyNum][toyNum];
			
			// 장난감 받으면서 answer 채움 
			for (int j = 0; j < toyNum; j++) {
				toys[j] = sc.nextInt();
				cur = toys[j];
				if (j == 0) {
					answer[j] = cur;
				} else {
					answer[j] = answer[j - 1] + (cur == pre ? 0 : 1);
				}
				pre = cur;
			}
			System.out.println(answer);
			
			// cost 값 채우기
			for (int x = 0; x < toyNum; x++) {
				boolean[] a = new boolean[toyNum];
				int count = 0;
				for (int y = x; y < Math.min(x + 20, toyNum); y++) {
					if(!a[toys[y]]) {
						count++;
						a[toys[y]] = true;
					}
					cost[x][y] = count*count;
				}
			}
			
		}
		sc.close();
		
		// 
		
	}
	
}

/*
출력
#1 6
#2 14
*/