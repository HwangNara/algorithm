package acmicpc.p8000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            int answer = 0;
            int before = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'O') {
                    before = (before == 0) ? 1 : before + 1;
                    answer += before;
                } else {
                    before = 0;
                }
            }
            System.out.println(answer);
        }
    }
}
