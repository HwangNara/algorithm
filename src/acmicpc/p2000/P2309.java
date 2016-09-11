// TreeMap
//package acmicpc.p2000;
//
//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//public class P2309 {
//
//	static final int N = 9;
//	static int over = -100;
//	static Map<Integer, Integer> smalls = new TreeMap<>();
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < N; i++) {
//			int tmp = sc.nextInt();
//			over += tmp;
//			smalls.put(tmp, tmp);
//		}
//		sc.close();
//		
//		for (int i = 1; i <= over; i++) {
//			Integer h1 = smalls.get(i);
//			Integer h2 = smalls.get(over - i);
//			if (h1 != null && h2 != null) {
//				smalls.remove(h1);
//				smalls.remove(h2);
//				break;
//			}
//		}
//		
//		for (Integer height : smalls.keySet()) System.out.println(height);
//	}
//}


// 배열
package acmicpc.p2000;

import java.util.Scanner;

public class P2309 {

	static final int N = 9;
	static int over = -100;
	static boolean[] height = new boolean[301];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < N; i++) {
			int tmp = sc.nextInt();
			over += tmp;
			height[tmp] = true;
		}
		
		for (int i = 1; i <= over; i++) {
			if (height[i] && height[over - i]) {
				height[i] = false;
				height[over - i] = false;
				break;
			}
		}
		
		for (int i = 1; i < height.length; i++) {
			if (height[i]) System.out.println(i);
		}
		sc.close();
	}
}
