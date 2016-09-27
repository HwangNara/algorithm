package topcorder.book;

import java.util.Arrays;

public class C5_4 {

	public static void main(String[] args) {
		System.out.println(encrypt(new int[]{1, 2, 3}));
	}
	
	public static long encrypt(int[] numbers) {
		long answer = 1;
		Arrays.sort(numbers);
		numbers[0]++;
		for (int i = 0; i < numbers.length; i++) {
			answer *= numbers[i];
		}
		return answer;
	}
	
}
