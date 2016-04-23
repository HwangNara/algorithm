package acmicpc.p11000;

import java.util.Scanner;

public class P11052 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
        n = sc.nextInt();
        int[] bungs = new int[n];
        int[] answers = new int[n];

        for (int i = 0; i < n; i++) { 
        	bungs[i] = sc.nextInt();
        }
        
        answers[0] = bungs[0];
        for (int i = 1; i < n; i++) {
        	int max = 0;
        	max = bungs[i];
        	for (int j = 0; j <= i / 2; j++) {
        		if (max <= answers[j] + answers[i - j - 1]) {
        			max = answers[j] + answers[i - j - 1];
        		} 
        		
        	}
        	answers[i] = max;
        }
        
        
        
        System.out.println(answers[n - 1]);
        sc.close();
	}
}
