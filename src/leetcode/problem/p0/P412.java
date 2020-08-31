package leetcode.problem.p0;

import java.util.LinkedList;
import java.util.List;

public class P412 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(new P412().fizzBuzz(n));
    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
