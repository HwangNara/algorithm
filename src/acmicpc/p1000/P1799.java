// TODO 하는 중
package acmicpc.p1000;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P1799 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input_sample/acm_1799.txt"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[][] isAlive = new boolean[N][N]; // true가 놀 수 있는 곳 
		boolean[][] isEmpty = new boolean[N][N]; // true가 빈 곳
		int answer = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				isEmpty[i][j] = sc.nextInt() == 1 ? true : false;
				isAlive[i][j] = isEmpty[i][j];
			}
		}
		
		// 다 둘러보면서 빈곳에 넣기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				
				// 비었으면서 놓을 수 있으면 놓기
				if (isEmpty[i][j] && isAlive[i][j]) {
					answer++;
					isEmpty[i][j] = false;
					
					// 현재 놓은 녀석의 영향이 있는 곳은 다 죽임
					isAlive[i][j] = false;
					
					
				}
			}
		}
		
		System.out.println(answer);
		sc.close();
	}
}
