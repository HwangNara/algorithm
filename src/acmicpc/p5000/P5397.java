package acmicpc.p5000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class P5397 {
	
	static int sp = 0; // 이제 쓸 곳
	static List<Character> keys = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder temp = new StringBuilder();
		for (int T = 0; T < N; T++) {
			temp.setLength(0);
			temp.append(br.readLine());
			int tempLenth = temp.length();
			sp = 0;
			keys.clear();
			
			for (int i = 0; i < tempLenth; i++) {

				char key = temp.charAt(i);
				
				switch(key) {
				case '<' :
					if (sp > 0) sp--;
					break;
				case '>' :
					if (sp < keys.size()) {
						sp++;
					}
					break;
				case '-' :
					if (sp > 0) {
						keys.remove(sp - 1);
						sp--;
					}
					break;
				default :
					if (sp < keys.size()) {
						keys.add(sp++, key);						
					} else {
						keys.add(key);
						sp++;
					}
					break;
				}
			}
			
			sb.setLength(0);
			for (char key : keys) sb.append(key);
			System.out.println(sb.toString());
		}
	}
}
