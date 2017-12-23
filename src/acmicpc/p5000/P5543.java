package acmicpc.p5000;

import java.util.Arrays;
import java.util.Scanner;

public class P5543 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] bur = new int[3];
		int[] drink = new int[2];
		
		for (int i = 0; i < bur.length; i++) bur[i] = sc.nextInt();
		for (int i = 0; i < drink.length; i++) drink[i] = sc.nextInt();
		
		Arrays.sort(bur);
		Arrays.sort(drink);
		
		System.out.println(bur[0] + drink[0] - 50);
		
		
		sc.close();
	}
}
