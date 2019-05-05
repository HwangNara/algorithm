package acmicpc.p2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2108 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long sum = 0;
        long[] nums = new long[N];
        int[] frequency = new int[8001];
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int m = Integer.parseInt(br.readLine());
            nums[i] = m;
            sum += m;
            frequency[m + 4000]++;
            max = Math.max(m, max);
            min = Math.min(m, min);
        }
        Arrays.sort(nums);

        System.out.println(Math.round((sum + 0.0) / N));
        System.out.println(nums[N / 2]);
        System.out.println(printMode(frequency));
        System.out.println(max - min);
    }

    private static int printMode(int[] frequency) {
        int max = Integer.MIN_VALUE;
        for (int f : frequency) {
            max = Math.max(f, max);
        }

        int mode = 0;
        int freq = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == max) {
                freq++;
                mode = i - 4000;
                if (freq == 2) {
                    break;
                }
            }
        }
        return mode;
    }
}
