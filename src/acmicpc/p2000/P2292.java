package acmicpc.p2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2292 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long sum = 0;
        for (int i = 0; i < 200000000; i++) {
            sum += 6 * i;
            if (N <= sum + 1) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}

