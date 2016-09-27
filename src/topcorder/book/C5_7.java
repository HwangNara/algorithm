package topcorder.book;

public class C5_7 {

	public static void main(String[] args) {
		System.out.println(find("abab"));
	}
	
	public static int find(String s) {

		// 답의 문자 길이를 결정
		for (int i = s.length(); ; i++) {
			
			boolean flag = true;
			for (int k = 0; k < s.length(); k++) {
				
				// 반대쪽에 문자가 존재하는데 다를 경우 flag 변경
				if ((i - k - 1) <= s.length() / 2 + 1 && s.charAt(k) != s.charAt(i - k - 1)) {
					flag = false;
					break;
				}
			}
			if (flag) return i;
		}
	}
}
