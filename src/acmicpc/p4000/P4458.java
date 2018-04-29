package acmicpc.p4000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4458 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String line = br.readLine();
            char first = line.charAt(0);
            first = first >= 97 ? (char)(first-32) : first;
            System.out.println(first + line.substring(1, line.length()));
        }
    }
}
