package acmicpc.p1000;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P1331 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input_sample/acm_1331.txt"));
		Scanner sc = new Scanner(System.in);
		int N = 36;
		String[] coor = new String[N];
		boolean[][] isCheck = new boolean[7][7];
		boolean isValid = false;
		int column = 0;
		int row = 0;
		int preColumn = 0;
		int preRow = 0;
		int firstColumn = 0;
		int firstRow = 0;
		int i = 0;
		for (i = 0; i < N; i++) coor[i] = sc.nextLine();

		// 처음 세팅
		firstRow = coor[0].charAt(1) - 48;
		preRow = firstRow;
		firstColumn = coor[0].charAt(0) - 64;
		preColumn = firstColumn;
		isCheck[preRow][preColumn] = true;
		// 이동
		for (i = 1; i < N; i++) {
			column = coor[i].charAt(0) - 64;
			row = coor[i].charAt(1) - 48;
			
			// 이동범위를 벗어나거나 이미 방문한 지역이면 Invalid
			if (Math.abs(row - preRow) + Math.abs(column - preColumn) != 3 ||
					row == preRow || column == preColumn ||
					isCheck[row][column] == true){
				isValid = false;
				break;
			}
			
			// 마지막이면 체크
			if (i == N - 1) {
				if (Math.abs(row - firstRow) + Math.abs(column - firstColumn) == 3 &&
						(row != firstRow && column != firstColumn)) {
					isValid = true;
				}
			}
			
			// 현재 위치 발자국
			isCheck[row][column] = true;
			
			// 현재 위치를 다음에 사용하기 위해 저장
			preColumn = column;
			preRow = row;
		}
		
		// 이미 valid여도 다 돌았나 체크
		if (isValid) {
			label: for (int k = 1; k <= 6; k++) {
				for (int j = 1; j <= 6; j++) {
					if (isCheck[k][j] == false) {
						isValid = false;
						break label;
					}
				}
			}
		}
		
		System.out.println(isValid ? "Valid" : "Invalid");
		
		sc.close();
	}
}
