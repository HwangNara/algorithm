package topcorder.book;

public class C07_04 {

	public static void main(String[] args) {
	
		C07_04 test = new C07_04();
		test.knapsack(0, 0, 0);
	}
	
	int[] ws = {3, 4, 1, 2, 3};
	int[] ps = {2, 3, 2, 3, 6};
	int maxw = 10;
	
	int ret = 0;
	
	void knapsack(int n, int w, int p) {
		if (w > maxw) return;
		ret = Math.max(ret, p);
		if (n >= ws.length) return;
		knapsack(n + 1, w, p);
		knapsack(n + 1, w + ws[n], p + ps[n]);
	}
}
