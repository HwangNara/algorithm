package topcorder.book;

public class C05_14 {

	public static void main(String[] args) {
		System.out.println(theNumber("NNNN"));
	}

	private static int theNumber(String answer) {
		
		int[][] cards = 
			{
				{1, 2, 3, 4, 5, 6, 7, 8},
				{1, 2, 3, 4, 9, 10, 11, 12},
				{1, 2, 5, 6, 9, 10, 13, 14},
				{1, 3, 5, 7, 9, 11, 13, 15}
			};
		
		loop:for (int i = 1; i <= 16; i++) {
			for (int j = 0; j < cards.length; j++) {
				if (check(cards[j], i) != answer.charAt(j)) continue loop;
			}
			return i;
		}
		return 16;
	}

	private static char check(int[] is, int i) {
		for (int k : is) {
			if (i == k) return 'Y';
		}
		return 'N';
	}
	
}
