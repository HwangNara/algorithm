package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1028 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		boolean[][] map = new boolean[R][C];
		for (int i = 0; i < R; i++) {
			String temp = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = temp.charAt(j) == '1' ? true : false;
			}
		}
		
		int maxSize = getMaxSize(R, C); // 최대 가능한 다이아  크기
		
		
		for (int k = 0; k < map.length; k++) {
			
		}
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				
			}
		}
	}

	private static int getMaxSize(int r, int c) {
		return  (int) Math.ceil( Math.min(r, c) / 2.0);
	}
}
