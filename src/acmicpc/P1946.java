package acmicpc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P1946 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input_sample/acm_1946.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {
			
			int N = sc.nextInt();
			Map<Integer, Integer> map = new TreeMap<>();
			int[] tests = new int[N];
			int passMan = 0;
			boolean isOk = true;
			for (int i = 0; i < N; i++) {
				map.put(sc.nextInt(), sc.nextInt());
			}
			
			int index = 0;
			for (int key : map.keySet()) {
				tests[index++] = map.get(key);
			}
			
			for (int manOrder = N - 1; manOrder >= 0; manOrder--) {
				isOk = true;
				for (int checkOrder = manOrder; checkOrder >= 0; checkOrder--) {
					if (checkOrder == manOrder) continue;
					if (tests[checkOrder] < tests[manOrder]) {
						isOk = false;
						break;
					}
				}
				if (isOk) passMan++;
			}
			
			// 정답 출력
			System.out.println(passMan);
		}
		sc.close();
	}
}
