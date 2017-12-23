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
		
		// �ּҰ��� ���� �ּҰ��� 0�� �ǰ�
		for (i = 0; i < arr.length; i++) arr[i] = arr[i] - min; 
		
		// counts ����
		int[] counts = new int[max - min + 1];
		
		// counts�� �� �� �Ҵ�
		for (i = 0; i < arr.length; i++) counts[arr[i]]++;
		
		// counts�� ������������ ����
		for (i = 1; i < counts.length; i++) counts[i] += counts[i - 1];
		
		// counting sort
		for (i = arr.length - 1; i >= 0; i--) answers[counts[arr[i]]-- - 1] = arr[i];
		
		// �ٽ� �ּҰ��� ���ؼ� ���� ���ڷ� ����
		for (i = 0; i < answers.length; i++) answers[i] = answers[i] + min;
		for (int k : answers) System.out.println(k);
		sc.close();
	}
}
