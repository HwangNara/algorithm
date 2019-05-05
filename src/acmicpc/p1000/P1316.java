package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            Set<Character> set = new HashSet<>();
            char before = '0';

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (set.contains(c) && before != c) {
                    break;
                }
                set.add(c);
                before = c;
                if (j == str.length()-1) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
