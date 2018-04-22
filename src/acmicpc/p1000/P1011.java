package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1011 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
		for (int i=0; i<n; i++) {
		    sb.setLength(0);
            st = new StringTokenizer(br.readLine());
            int x = Math.abs(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
            bw.write(sb.append(answer(x)).append("\n").toString());
        }
        bw.flush();
	}

    private static long answer(int x) {
	    long answer = 0;
	    long counter = 0;
	    for (long i=1;;i++) {
	        for (int j=0; j<2; j++) {
                counter += i;
                if (counter >= x) return ++answer;
                ++answer;
            }
        }
    }
}
