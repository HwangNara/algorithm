package topcorder.book;

public class C05_16 {

	public static void main(String[] args) {
		System.out.println(theNumber("NNNN"));
	}

	private static int theNumber(String answer) {
		
		String[] c = 
			{
				"YYYY",
				"YYYN",
				"YYNY",
				"YYNN",
				"YNYY",
				"YNYN",
				"YNNY",
				"YNNN",
				"NYYY",
				"NYYN",
				"NYNY",
				"NYNN",
				"NNYY",
				"NNYN",
				"NNNY",
				"NNNN"
			};
		
		for (int i = 1; i <= 15; i++) {
			if (answer.equals(c[i])) return i + 1;
		}
		return 0;
	}
	
}
