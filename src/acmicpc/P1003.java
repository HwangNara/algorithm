package acmicpc;

import java.util.Scanner;

public class P1003 {
	
	static int[] counter = new int[2];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] fibos = new int[n];
		for (int i = 0; i < n; i++) {
			fibos[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			counter[0] = 0;
			counter[1] = 0;
			fibonacci(fibos[i]);
			System.out.println(counter[0] + " " + counter[1]);
		}
			 
		sc.close();
	}

	private static int fibonacci(int n) {
	    if (n==0) {
	    	counter[0]++;
	        return 0; 
	    } else if (n==1) {
	    	counter[1]++;
	        return 1;
	    } else {
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	}
	
}
