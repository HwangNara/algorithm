package acmicpc.p9000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9020 {
    private static final int N = 10000;
    private static boolean[] primes = new boolean[N + 1];

    static {
        for (int i = 0; i < primes.length; i++) primes[i] = true;
        primes[0] = primes[1] = false;
        for (int i = 2; i <= N; i++) {
            if (!primes[i]) continue;
            primes[i] = true;
            for (int j = i + i; j < primes.length; j += i) {
                primes[j] = false;
            }
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int idx = 0; idx < T; idx++) {
            int n = Integer.parseInt(br.readLine());
            for (int me = n / 2; me >= 2; me--) {
                int other = n - me;
                if (primes[me] && primes[other]) {
                    System.out.println(me + " " + other);
                    break;
                }
            }
        }
    }
}
