package topcorder.book;

public class C07_07 {

	public static void main(String[] args) {

		int[] ws = {3, 4, 1, 2, 3};
		int[] ps = {2, 3, 2, 3, 6};
		int maxw = 10;
		int[][] dp = new int[6][11];
		int ret = 0;
		
		for (int i = 0; i < ws.length; i++) {
			for (int j = 0; j <= maxw; j++) {
				if (j + ws[i] <= maxw) {
					dp[i + 1][j + ws[i]] = Math.max(dp[i + 1][j + ws[i]], dp[i][j] + ps[i]);
					ret = Math.max(dp[i + 1][j + ws[i]], ret);
				}
			}
		}
		System.out.println(ret);
	}
	

}
