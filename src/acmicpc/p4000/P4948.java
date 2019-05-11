package acmicpc.p4000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4948 {

    private static boolean[] primes = new boolean[123456 * 2 + 1];

    static {
        primes[0] = primes[1] = false;
        primes[2] = true;
        for (int i = 3; i < primes.length; i++) {
            primes[i] = isPrime(i);
        }
    }

    private static boolean isPrime(int n) {
        if ((n & 1) == 0) return false;
        for (int i = 3; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int answer = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (primes[i]) answer++;
            }
            System.out.println(answer);
        }
    }
}
