package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class P1946 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int N = 0;
		for (int test_case = 0; test_case < T; test_case++) {
			
			String tmpN = br.readLine();
			if (tmpN == null || tmpN.length() == 0) continue;
			
			N = Integer.parseInt(tmpN);
			Map<Integer, Integer> map = new TreeMap<>();
			int[] tests = new int[N + 1];
			int passMan = 0;
			boolean isOk = true;
			StringTokenizer st;
			for (int i = 0; i < N; i++) {
				String tmp = br.readLine();
				if (tmp == null || tmp.length() == 0) continue;
				st = new StringTokenizer(tmp);
				map.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}
			
			int index = 0;
			for (int key : map.keySet()) {
				tests[index++] = map.get(key);
			}
			
			for (int manOrder = N - 1; manOrder >= 0; manOrder--) {
				isOk = true;
				for (int checkOrder = manOrder - 1; checkOrder >= 0; checkOrder--) {
					if (tests[checkOrder] < tests[manOrder]) {
						isOk = false;
						break;
					}
				}
				if (isOk) passMan++;
			}
			
			System.out.println(passMan);
		}
	}
}
