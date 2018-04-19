package codeGround.scpc2015pre;

import java.util.Scanner;
import java.io.FileInputStream;

public class Frog {

	static int[] stones;
	static int test_case = 0;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(new FileInputStream("input_sample/frog_input.txt"));
//		Scanner sc = new Scanner(System.in);

		int TC = 0;
		int jump = 0;
		int range = 0;
		int rangeCheck = 0;
		int arrayCheckPointer = 0;
		int stonesSize = 0;
		int currentPosition;

		TC = sc.nextInt();
		for(test_case = 1; test_case <= TC; test_case++) {

			jump = 0;
			range = 0;
			rangeCheck = 0;
			arrayCheckPointer = 0;
			currentPosition = 0;

			stones = new int[sc.nextInt()];
			stonesSize = stones.length;
			for (int i = 0; i < stonesSize; i++) {
				stones[i] = sc.nextInt();
				if (i > 0) {
					rangeCheck = rangeCheck >= stones[i] - stones[i - 1] ? rangeCheck : stones[i] - stones[i - 1];
				}
			}
			range = sc.nextInt();

			if (rangeCheck > range) {
				answerPrint(-1);
				continue;
			}

			while (arrayCheckPointer < stonesSize - 1) {

				for (int i = arrayCheckPointer + 1; i < stonesSize;i++) {

					if (range < stones[i] - currentPosition) {
						break;
					}
					arrayCheckPointer++;
				}
				currentPosition = stones[arrayCheckPointer];
				jump++;
			}
			answerPrint(jump);
		}
		sc.close();
	}

	private static void answerPrint(int count) {
		System.out.println("Case #" + test_case);
		System.out.println(count);
	}
}