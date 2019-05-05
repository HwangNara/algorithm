package acmicpc.p2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n == 3) {
            System.out.println(1);
            return;
        }

        for (int i = 0; i < n / 5; i++) {
            int mok = n / 5 - i;
            int namuji = n % 5 + 5 * i;

            if (namuji % 3 == 0) {
                System.out.println(mok + namuji / 3);
                return;
            }
        }

        if (n % 3 == 0) {
            System.out.println(n / 3);
            return;
        }

        System.out.println("-1");
    }
}
