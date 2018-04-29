package acmicpc.p1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1212 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String n = br.readLine();
        int nSize = n.length();

        for (int i = 0; i < nSize; i++) {
            switch (n.charAt(i)) {
                case '0':
                    sb.append(i == 0 ? "0" : "000");
                    break;
                case '1':
                    sb.append(i == 0 ? "1" : "001");
                    break;
                case '2':
                    sb.append(i == 0 ? "10" : "010");
                    break;
                case '3':
                    sb.append(i == 0 ? "11" : "011");
                    break;
                case '4':
                    sb.append("100");
                    break;
                case '5':
                    sb.append("101");
                    break;
                case '6':
                    sb.append("110");
                    break;
                case '7':
                    sb.append("111");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}