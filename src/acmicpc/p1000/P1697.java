package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1697 {
	
	static int LIMIT = 200000;
	static int answer = 0;
	static Map<Integer, Boolean> visited = new HashMap<>();

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int step = 1;
		
		Queue<Integer> queue = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		queue.offer(N);
		while (!queue.isEmpty()) {
			if (N == K) break;
			
			int loc = queue.poll();
			
			move(loc - 1, step, K, list);
			move(loc + 1, step, K, list);
			move(loc * 2, step, K, list);
			
			if (answer != 0) break;
			
			if (queue.isEmpty()) {
				queue = new LinkedList<>(list);
				list.clear();
				step++;
			}
		}
		System.out.println(answer);
	}

	private static void move(int i, int step, int k, List<Integer> list) {
		
		if (i == k) {
			answer = step;
			return;
		}

		if (i > 2 * LIMIT || i < 0) return;
		
		Boolean visit = visited.get(i);
		if (visit == null) {
			visited.put(i, true);
			list.add(i);
		}
	}
}
