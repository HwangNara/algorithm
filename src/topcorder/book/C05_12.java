package topcorder.book;

public class C05_12 {

	static boolean[][] grid = new boolean[100][100];
	static int vx[] = {1, -1, 0, 0};
	static int vy[] = {0, 0, 1, -1};
	static double[] prob = new double[4];
	
	public static void main(String[] args) {
		System.out.println(getProability(1, 25, 25, 25, 25));
		System.out.println(getProability(2, 25, 25, 25, 25));
		System.out.println(getProability(7, 50, 0, 0, 50));
		System.out.println(getProability(14, 50, 50, 0, 0));
		System.out.println(getProability(14, 25, 25, 25, 25));
	}
	
	public static double getProability(int n, int east, int west, int south, int north) {
		prob[0] = east / 100.0;
		prob[1] = west / 100.0;
		prob[2] = south / 100.0;
		prob[3] = north / 100.0;
		
		return dfs(50, 50, n);
	}

	private static double dfs(int x, int y, int n) {
		if (grid[x][y]) return 0;
		if (n == 0) return 1;
		
		grid[x][y] = true;
		double ret = 0;
		for (int i = 0; i < 4; i++) {
			ret += dfs(x + vx[i], y + vy[i], n - 1) * prob[i];
		}
		grid[x][y] = false;
		
		return ret;
	}
}
