package acmicpc.p11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class P11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        IntStream.range(0, Integer.parseInt(br.readLine()))
                .forEach(i -> {
                    try {
                        int a = Integer.parseInt(br.readLine());
                        if (a == 0) {
                            result.append(Optional.ofNullable(queue.poll()).orElse(0)).append("\n");
                            return;
                        }
                        queue.offer(a);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        System.out.println(result.toString());
    }
}
