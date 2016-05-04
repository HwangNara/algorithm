package acmicpc.p4000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P4504 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		List<String> list = new ArrayList<>();
		while ((num = sc.nextInt()) != 0) {
			list.add(num + " is" + mul(num, n) + " a multiple of " + n + ".");
		}
		
		for (String s : list) System.out.println(s);
		sc.close();
	}

	private static String mul(int num, int n) {
		return num % n == 0 ? "" : " NOT";
	}
}
 