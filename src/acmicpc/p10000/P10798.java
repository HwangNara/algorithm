package acmicpc.p10000;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P10798 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 5;
		List<String> list = new ArrayList<>();
		String temp;
		int maxLength = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			temp = sc.nextLine();
			list.add(temp);
			maxLength = temp.length() > maxLength ? temp.length() : maxLength;
		}
		
		for (int i = 0; i < maxLength; i++) {
			for (int j = 0; j < n; j++) {
				temp = list.get(j);
				if (temp.length() - 1 >= i) {
					System.out.print(temp.charAt(i));
				}
			}
		}
		
		sc.close();
	}
}
