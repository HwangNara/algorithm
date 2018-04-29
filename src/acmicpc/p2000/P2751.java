package acmicpc.p2000;

import java.util.Scanner;

public class P2751 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int[] answers = new int[N];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > max) max = arr[i];
			if (arr[i] < min) min = arr[i];
		}

		// 최소값을 빼서 최소값이 0이 되게
		for (i = 0; i < arr.length; i++) arr[i] = arr[i] - min;

		// counts 생성
		int[] counts = new int[max - min + 1];

		// counts에 각 빈도 할당
		for (i = 0; i < arr.length; i++) counts[arr[i]]++;

		// counts를 오름차순으로 변경
		for (i = 1; i < counts.length; i++) counts[i] += counts[i - 1];

		// counting sort
		for (i = arr.length - 1; i >= 0; i--) answers[counts[arr[i]]-- - 1] = arr[i];

		// 다시 최소값을 더해서 원래 숫자로 변경
		for (i = 0; i < answers.length; i++) answers[i] = answers[i] + min;
		for (int k : answers) System.out.println(k);
		sc.close();
	}
}
