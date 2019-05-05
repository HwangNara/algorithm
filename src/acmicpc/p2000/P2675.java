package acmicpc.p2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2675 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            sb.setLength(0);
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            int iter = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < iter; k++) {
                    sb.append(str.charAt(j));
                }
            }
            System.out.println(sb.toString());
        }
    }
}
