package acmicpc.p10000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		/**
		 * A[10001] 등장횟수
		 * B[10001] 누적합
		 * C[N+1] 답
		 */
		int[] A = new int[10001];
		for (int i = 0; i < arr.length; i++) {
			A[arr[i]]++;
		}

		int[]B = new int[10001];
		B[0] = A[0];
		for (int i = 1; i < A.length; i++) {
			B[i] = B[i-1] + A[i];
		}

		int[]C = new int[N+1];
		for (int i = arr.length - 1; i >= 0; i--) {
			C[B[arr[i]]] = arr[i];
			B[arr[i]]--;
		}

		for (int i = 1; i < C.length; i++) {
			sb.append(C[i]);
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
