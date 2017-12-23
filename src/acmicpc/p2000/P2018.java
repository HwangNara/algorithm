package acmicpc.p2000;

import java.util.Scanner;

public class P2018 {
 
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long cnt = 0;
        long answer = 0;
        for (int i = 1; i <= N; i++) {
            answer = 0;
            for (int j = i; j <= N; j++) {
                answer += j;
                if (answer > N) break;
                if (answer == N) {
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
