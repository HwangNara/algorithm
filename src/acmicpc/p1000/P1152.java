package acmicpc.p1000;

import java.util.Arrays;
import java.util.Scanner;

public class P1152 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String row = sc.nextLine();
        sc.close();
        row = row.trim();
        System.out.println(row.equals("") ? "0" : Arrays.stream(row.split(" ")).filter(str -> !str.equals("")).count());
	}
}
