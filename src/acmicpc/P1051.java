package acmicpc;

import java.io.IOException;
import java.util.Scanner;

public class P1051 {

	static int size = 1;
	
	public static void main(String[] args) throws IOException {
		
		// N와 M 입력
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		String[] arr = new String[N];
		
		// N개의 데이터 받기 
		for (int i = 0; i < N; i++) {
			arr[i] = scan.next();
		}
		
		// 정사각형의 한 변의 길이(2 ~ M or N)
		for (int edge = 2; edge <= (N >= M ? M : N); edge++) {
			for (int downPoint = 0; downPoint < N - edge + 1; downPoint++) {
				for (int leftUpPoint = 0; leftUpPoint < M - edge + 1; leftUpPoint++) {
					char cmp = arr[downPoint].charAt(leftUpPoint);
					if (cmp == arr[downPoint + edge - 1].charAt(leftUpPoint) &&
						cmp == arr[downPoint + edge - 1].charAt(leftUpPoint + edge - 1) &&
						cmp == arr[downPoint].charAt(leftUpPoint + edge - 1)) {
						size = edge > size ? edge : size;
					}
				}
			}
		}
	
		System.out.println(size * size);
		
		scan.close();
	}
}
