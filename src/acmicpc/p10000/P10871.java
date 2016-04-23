package acmicpc.p10000;

import java.util.Scanner;

public class P10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] answers = new int[10000];
		int counter = 0;
		int temp = 0;
		int N = sc.nextInt();
		int comp = sc.nextInt();
		for (int i = 0; i < N; i++) {
			temp = sc.nextInt();
			if (temp < comp) {
				answers[counter++] = temp;
			}
		}
		
		for (int i = 0; i < counter; i++) {
			System.out.print(answers[i]);
			if (counter - 1 > i) System.out.print(" "); 
		}
		sc.close();
	}
}
