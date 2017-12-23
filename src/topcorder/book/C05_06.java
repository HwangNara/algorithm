package topcorder.book;

import java.util.ArrayList;

public class C05_06 {

	public static void main(String[] args) {
		int[] result = digits(10);
		
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	public static int[] digits(int base) {
		ArrayList<Integer> v = new ArrayList<>();
		
		for (int n = 3; n <= base; n++) {
			if ((base - 1) % n == 0) v.add(n);
		}
	
		int[] ans = new int[v.size()];
		for (int i = 0; i < v.size(); i++) ans[i] = v.get(i);
		
		return ans;
	}
	
}
