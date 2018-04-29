package acmicpc.p4000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4796 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1;
        while(true) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if (L == 0 && P == 0 && V == 0) break;
            System.out.printf("Case %d: %d\n", n++, (V / P) * L + Math.min(V % P, L));
        }
    }
}
