package topcorder.book;

public class C07_05 {

	public static void main(String[] args) {
	
		C07_05 test = new C07_05();
		System.out.println(test.knapsack(1, 0));
	}
	
	int[] ws = {3, 4, 1, 2, 3};
	int[] ps = {2, 3, 2, 3, 6};
	int maxw = 10;
	
	int knapsack(int n, int w) {
		if (w > maxw) return -1;
		if (n >= ws.length) return 0;
		return Math.max(knapsack(n + 1, w), knapsack(n + 1, w + ws[n]) + ps[n]);
	}
}
