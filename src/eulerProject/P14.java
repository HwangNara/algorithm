package eulerProject;

public class P14 {

	public static void main(String[] args) {
		
		int maxCount = 0;
		int answer = 0;
		int count = 0;
		long n = 0L;

		for (int i = 1; i <= 1000000; i++) {

			n = i;
			count = 1;
			
			while (n != 1) {
				
				if (n == 1) break;
				
				if (n % 2 == 0) {
					n /= 2;
				} else if (n % 2 == 1) {
					n = 3 * n + 1;
				}
				count++;
			}
			
			if (count > maxCount) {
				maxCount = count;
				answer = i;
			}
		}
		
		System.out.println(answer + ", " + maxCount);
		
	}
}
