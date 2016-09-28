package topcorder.book;

public class C05_14_MY {

	static int[] answers = new int[16];
	static boolean[] notAnswers = new boolean[16];
	static int[][] cards = 
		{
			{1, 2, 3, 4, 5, 6, 7, 8},
			{1, 2, 3, 4, 9, 10, 11, 12},
			{1, 2, 5, 6, 9, 10, 13, 14},
			{1, 3, 5, 7, 9, 11, 13, 15}
		};

	public static void main(String[] args) {
		System.out.println(theNumber("NYNY"));
	}

	private static int theNumber(String answer) {
		
		int answerCount = 0;
		for (int i = 0; i < answer.length(); i++) {
			char answerOne = answer.charAt(i); 
			if (answerOne == 'N') {
				for (int j = 0; j < cards[i].length; j++) {
					notAnswers[cards[i][j]] = true;
				}
				continue;
			}

			answerCount++;
			for (int j = 0; j < cards[i].length; j++) {
				answers[cards[i][j]]++;
			}
		}
		
		for (int i = 1; i < answers.length; i++) {
			if (answers[i] == answerCount && !notAnswers[i]) return i;
		}
		return 16;
	}
	
}
