package topcorder.book;

public class C05_07 {

	public static void main(String[] args) {
		System.out.println(find("abab"));
	}
	
	public static int find(String s) {

		for (int i = s.length(); ; i++) {
			
			boolean flag = true;
			for (int k = 0; k < s.length(); k++) {
				
				if ((i - k - 1) <= s.length() / 2 + 1 && s.charAt(k) != s.charAt(i - k - 1)) {
					flag = false;
					break;
				}
			}
			if (flag) return i;
		}
	}
}
