package acmicpc.p11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class P11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            Integer a1 = Math.abs(o1);
            Integer a2 = Math.abs(o2);
            if (a1.equals(a2)) {
                return o1.compareTo(o2);
            }
            return a1 - a2;
        });
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
