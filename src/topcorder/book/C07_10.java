package topcorder.book;

public class C07_10 {

	long [][][] ways = new long[100][100][55];
	int[] dx = new int[] { 1, 1, 1, 0, -1, -1, -1, 0, 2, 1, -1, -2, -2, -1, 1, 2};
	int[] dy = new int[] {1, 0, -1, -1, -1, 0, 1, 1, -1, -2, -2, -1, 1, 2, 2, 1};
	
	public long howMany(int size, int[] start, int[] end, int numMoves) {
		int x, y, i, j;
		int sx = start[0], sy = start[1], ex = end[0], ey = end[1];
		
		ways[sy][sx][0] = 1;
		
		for (i = 1; i <= numMoves; i++) {
			for (x = 0; x < size; x++) {
				for (y = 0; y < size; y++) {
					for (j = 0; j < 16; j++) {
						int nx = x + dx[j];
						int ny = y + dy[j];
						if (nx < 0 || ny < 0 || nx >= size || ny >= size) continue;
						ways[ny][nx][i] += ways[y][x][i - 1];
					}
				}
			}
		}
		return ways[ey][ex][numMoves];
	}
	
	public static void main(String[] args) {
		int size = 3;
		int[] start = {0, 0};
		int[] end = {0, 2};
		int numMoves = 2;
		
		System.out.println(new C07_10().howMany(size, start, end, numMoves));
	}
}
