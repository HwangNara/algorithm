package leetcode.problem.p0;

public class P605 {
    public static void main(String[] args) {
        // 0 연속 개수
        /**
         * 1이 인접하지 않은 0의 개
         * 1: 1
         * 2: 1
         * 3: 2
         * 4: 2
         * 5: 3
         * 6: 3
         * 7: 4
         *
         * n: (n+1) / 2
         */
        System.out.println(new P605().canPlaceFlowers(new int[] { 1 }, 0));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;

        if (n == 0) {
            return true;
        }
        if (length == 1) {
            return flowerbed[0] != 1;
        }

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 1) {
                flowerbed[i] = -1;
                if (i > 0) {
                    flowerbed[i - 1] = -1;
                }
                if (i + 1 < length) {
                    flowerbed[i + 1] = -1;
                }
            }
        }
        int count = 0;
        int sequentialZero = 0;
        for (int f : flowerbed) {
            if (f == 0) {
                sequentialZero++;
            } else {
                count += (sequentialZero + 1) / 2;
                sequentialZero = 0;
            }
            if (count >= n) {
                return true;
            }
        }
        count += (sequentialZero + 1) / 2;
        return count >= n;
    }
}
