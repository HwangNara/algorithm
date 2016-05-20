// TODO �ϴ� ��
package acmicpc.p1000;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P1799 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input_sample/acm_1799.txt"));
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[][] isAlive = new boolean[N][N]; // true�� �� �� �ִ� �� 
		boolean[][] isEmpty = new boolean[N][N]; // true�� �� ��
		int answer = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				isEmpty[i][j] = sc.nextInt() == 1 ? true : false;
				isAlive[i][j] = isEmpty[i][j];
			}
		}
		
		// �� �ѷ����鼭 ����� �ֱ�
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				
				// ������鼭 ���� �� ������ ����
				if (isEmpty[i][j] && isAlive[i][j]) {
					answer++;
					isEmpty[i][j] = false;
					
					// ���� ���� �༮�� ������ �ִ� ���� �� ����
					isAlive[i][j] = false;
					
					
				}
			}
		}
		
		System.out.println(answer);
		sc.close();
	}
}
