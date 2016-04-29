package codeGround.scpc2015pre;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.FileInputStream;

public class MirrorOfRoom {

	static D direction = D.RIGHT;
	static String[] mirrors;
	static Scanner sc;
	
	public static void main(String args[]) throws Exception	{
		sc = new Scanner(new FileInputStream("input_sample/mirror_input.txt"));
//		sc = new Scanner(System.in);

		int TC;
		int test_case;
		int row;
		int column;
		char mirror;

		TC = Integer.parseInt(sc.nextLine());        
		for(test_case = 1; test_case <= TC; test_case++) {
        
			int N = Integer.parseInt(sc.nextLine());
			Set<Integer> mirrorSet = new HashSet<>();
			mirrors = new String[N];
			for (int i = 0; i < N; i++)	mirrors[i] = sc.nextLine();
			
			// 필요한 변수들 초기화
			row = 0;
			column = 0;
			mirror = ' ';
			direction = D.RIGHT;
			
			while (true) {
				
				// 범위 넘으면 아웃
				if (row < 0 || row >= N || column < 0 || column >= N) break;
				
				// 방향에 따라 조작
				// 1 : / ,  2 : \
				mirror = mirrors[row].charAt(column);
				if (mirror == '1' || mirror == '2')	mirrorSet.add(N * row + column);
				
				switch(direction) {
				case UP :
					if (mirror == '0') {
						row--;
					} else if (mirror == '1') {
						column++;
						direction = D.RIGHT;
					} else if (mirror == '2'){
						column--;
						direction = D.LEFT;
					}
					break;
				case RIGHT :
					if (mirror == '0') {
						column++;
					} else if (mirror == '1') {
						direction = D.UP;
						row--;
					} else if (mirror == '2'){
						direction = D.DOWN;
						row++;
					}
					break;
				case DOWN :
					if (mirror == '0') {
						row++;
					} else if (mirror == '1') {
						direction = D.LEFT;
						column--;
					} else if (mirror == '2'){
						direction = D.RIGHT;
						column++;
					}
					break;
				case LEFT :
					if (mirror == '0') {
						column--;
					} else if (mirror == '1') {
						direction = D.DOWN;
						row++;
					} else if (mirror == '2'){
						direction = D.UP;
						row--;		
					}
					break;
				}
			}

			// 이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
			System.out.println(mirrorSet.size());
		}
		sc.close();
	}
}

enum D {
	UP, RIGHT, DOWN, LEFT;
}