package acmicpc.p9000;

import java.util.Scanner;

public class P9935 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer(sc.nextLine());
		String match = sc.nextLine();
		String[] temp;
		while (str.toString().contains(match)) {
			temp = str.toString().split(match);
			str.setLength(0);;
			for (int i = 0; i < temp.length; i++) {
				str = str.append(temp[i]);
			}
		}
		System.out.println(str.length() == 0 ? "FRULA" : str);
		sc.close();
	}
}
