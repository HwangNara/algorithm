package acmicpc.p2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2931 {

    public static void main(String[] args) throws IOException {
        String[] alphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (String alphabet : alphabets) {
            str = str.replaceAll(alphabet, ".");
        }
        System.out.println(str.length());
    }
}
