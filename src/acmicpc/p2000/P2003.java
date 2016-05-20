package acmicpc.p2000;

import java.util.Scanner;

public class P2003 {
 
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nums = new int[N];
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
         
        for (int i = 0; i < N; i++) {
            answer = 0;
            for (int j = i; j < N; j++) {
                answer += nums[j];
                if (answer > M) break;
                if (answer == M) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}