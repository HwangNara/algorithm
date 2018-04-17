package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1003 {

    private static int[] result0 = new int[41];
    private static int[] result1 = new int[41];
    static {
        result0[0] = 1;
        result0[1] = 0;
        result1[0] = 0;
        result1[1] = 1;
        for (int i = 2; i <= 40; i++) {
            result0[i] = result0[i-1] + result0[i-2];
            result1[i] = result1[i-1] + result1[i-2];
        }
    }
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int index = Integer.parseInt(br.readLine());
			sb.append(result0[index]).append(" ").append(result1[index]).append("\n");
		}
		
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
	}
}