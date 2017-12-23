package acmicpc.p1000;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P1620 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input_sample/acm_1620.txt"));
		Scanner sc = new Scanner(System.in);
		String firstLine = sc.nextLine();
		String[] params = firstLine.split(" ");
		int N = Integer.parseInt(params[0]);
		int question = Integer.parseInt(params[1]);
		String[] monsters = new String[N];
		Map<String, Integer> map = new TreeMap<>();
		
		String monster = "";
		for (int i = 0; i < N; i++) {
			monster = sc.nextLine();
			map.put(monster, i);
			monsters[i] = monster;
		}
		
		String tmp = "";
		int no = 0;
		for (int i = 0; i < question; i++) {
			try {
				tmp = sc.nextLine();
				no = Integer.parseInt(tmp);
				System.out.println(monsters[no - 1]);
			} catch (NumberFormatException ex) {
				System.out.println(map.get(tmp) + 1);
			}
		}
		sc.close();
	}
}
