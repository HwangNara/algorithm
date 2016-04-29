package acmicpc.p10000;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P10828 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String temp = "";
		Queue<String> que = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			if (T - 1 == i) {
				sc.nextLine();
			}
			temp = sc.nextLine();
			
			if (temp.length() >= 6 
				&& "push".equals(temp.substring(0, 4))) {
				que.add(temp.substring(0, 4));
				que.add(temp.substring(5, temp.length()));
			} else {
				que.add(temp);
			}
		}
		
//		for (String t : que) System.out.println(t);
		
		while (!que.isEmpty()) {
			switch (que.remove()) {
			case "push" :
				stack.add(Integer.parseInt(que.remove()));
				break;
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
				System.out.println(stack.peek());
				break;
			}
		}
		sc.close();
	}
	
}
