package acmicpc.p11000;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P11047 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input_sample/acm_11047.txt"));
		Scanner sc = new Scanner(System.in);
	
		int numOfCoins = sc.nextInt();
		int value = sc.nextInt();
		int[] coins = new int[numOfCoins];
		int answer = 0;
		
		for (int i = 0; i < numOfCoins; i++) coins[i] = sc.nextInt();
		
		for (int i = numOfCoins - 1; i >= 0; i--) {
			
			if (coins[i] > value) continue;
			
			answer += value / coins[i];
			value %= coins[i];
		}
		System.out.println(answer);
		sc.close();
	}

}
