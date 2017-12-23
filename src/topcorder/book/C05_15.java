package topcorder.book;

public class C05_15 {

	public static void main(String[] args) {
		System.out.println(theNumber("NNNN"));
	}

	private static int theNumber(String answer) {
		
		String[] c = 
			{
				"YYYYYYYYNNNNNNNN",
				"YYYYNNNNYYYYNNNN",
				"YYNNYYNNYYNNYYNN",
				"YNYNYNYNYNYNYNYN"
			};
		
		for (int i = 1; i <= 15; i++) {
			String temp = "";
			for (int j = 0; j < 4; j++) {
				temp += c[j].charAt(i);
			}
			if (answer.equals(temp)) return i + 1;
		}
		return 0;
	}
	
}
