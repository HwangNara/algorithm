package topcorder.book;

public class C07_06 {

	public static void main(String[] args) {
	
		C07_06 test = new C07_06();
		System.out.println(test.knapsack(1, 0));
		System.out.println();
	}
	
	int[] ws = {3, 4, 1, 2, 3};
	int[] ps = {2, 3, 2, 3, 6};
	int maxw = 10;
	int[][] dp = new int[6][11];
	
	int knapsack(int n, int w) {
		if (w > maxw) return -1;
		if (n >= ws.length) return 0;
		if (dp[n][w] > 0) return dp[n][w];
		return dp[n][w] = Math.max(knapsack(n + 1, w), knapsack(n + 1, w + ws[n]) + ps[n]);
	}
}
