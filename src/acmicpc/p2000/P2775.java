package acmicpc.p2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2775 {
    private final static int[][] apart = new int[14 + 1][14 + 1];

    static {
        for (int i = 0; i < apart.length; i++) {
            for (int j = 0; j < apart[i].length; j++) {
                apart[i][j] = i == 0 ? j : j == 0 ? 0 : j == 1 ? 1 : apart[i][j - 1] + apart[i - 1][j];
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int idx = 0; idx < T; idx++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            System.out.println(apart[K][N]);
        }
    }
}
