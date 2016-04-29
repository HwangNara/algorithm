package eulerProject;

public class P12 {

	public static void main(String[] args) {
		
		// 삼각수들 차례로 구하면서 계산
		int num = 0;
		long triNum = 0;
		while (true ){
			// 삼각수
			triNum += num++;
			// 삼각수의 약수가 최초로 500개 이상이면 끝내기 
			if (getSubmultipleNum(triNum) >= 500) break;
		}
		System.out.println(triNum);
	}

	private static int getSubmultipleNum(long triNum) {

		int numOfSubmultiple = 0;
		
		for (int i = 1; i <= (int)Math.sqrt(triNum); i++) {
			// 제곱수면 1개만 더하고 끝
			if (i * i == triNum) { 
				numOfSubmultiple++;
				break;
			}
			if (triNum % i == 0) {
				numOfSubmultiple += 2;
			}
		}
		return numOfSubmultiple;
	}
}
