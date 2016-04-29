package acmicpc.p10000;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P10828_1 {
	
	public static void main(String[] args) throws FileNotFoundException {
//		System.setIn(new FileInputStream("input_sample/bj10828.txt"));
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		String temp = "";
		Queue<String> que = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < T; i++) que.add(sc.nextLine());
		
		while (!que.isEmpty()) {
			temp = que.remove();
			switch (temp) {
			case "pop" :
				if (stack.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.pop());
				}
				break;
			case "size" :
				System.out.println(stack.size());
				break;
			case "empty" :
				System.out.println(stack.isEmpty() ? "1" : "0");
				break;
			case "top" :
				if (stack.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(stack.peek());
				}
				break;
			default :
				stack.add(Integer.parseInt(temp.substring(5, temp.length())));
				break;
			}
		}
		sc.close();
	}
	
}
