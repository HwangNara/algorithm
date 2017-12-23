package acmicpc.p4000;

public class P4673 {

	static int MAX = 10000;
	static boolean[] isNotSelfNums = new boolean[MAX + 1];

	public static void main(String[] args) {

		for (int i = 1; i < MAX; i++) checkSelfNum(i);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < isNotSelfNums.length; i++) {
			if (!isNotSelfNums[i]) sb.append(i + "\n");
		}
		System.out.println(sb.toString());
		
	}

	private static void checkSelfNum(int num) {
		
		if (num > MAX) return;
		
		String temp = Integer.toString(num);
		int result = num;
		for (int i = 0; i < temp.length(); i++) {
			result += Integer.parseInt(temp.charAt(i) + "");
		}
		
		if (result > MAX) return;
		isNotSelfNums[result] = true;
	}
}
