package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1193 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sector = 0;
        int bound = 0;
        for (int i = 1; i < 10000000; i++) {
            bound += i;
            if (N <= bound) {
                sector = i;
                break;
            }
        }

        int diff = bound - N;
        int left, right;
        if ((sector & 1) == 1) {
            right = sector - diff;
            left = sector - right + 1;
        } else {
            left = sector - diff;
            right = sector - left + 1;
        }
        System.out.println(left + "/" + right);
    }
}
