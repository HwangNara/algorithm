package codeGround.scpc2015pre;

/* 아래 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도 됩니다.
단, 사용하는 클래스명이 Solution 이어야 하며, 가급적 Solution.java 를 사용할 것을 권장합니다.
이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해 볼 수 있습니다. */
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution1 {
	
	static int[] stones;
	static int test_case = 0;
	
	public static void main(String args[]) throws Exception	{
		/* 아래 메소드 호출은 앞으로 표준입력(키보드) 대신 input.txt 파일로 부터 읽어오겠다는 의미의 코드입니다.
		   만약 본인의 PC 에서 테스트 할 때는, 입력값을 input.txt에 저장한 후 이 코드를 첫 부분에 사용하면,
		   표준입력 대신 input.txt 파일로 부터 입력값을 읽어 올 수 있습니다.
		   또한, 본인 PC에서 아래 메소드를 사용하지 않고 표준입력을 사용하여 테스트하셔도 무방합니다.
		   단, Codeground 시스템에서 "제출하기" 할 때에는 반드시 이 메소드를 지우거나 주석(//) 처리 하셔야 합니다. */
		
		Scanner sc = new Scanner(new FileInputStream("frog_input.txt"));
//		Scanner sc = new Scanner(System.in);

		int TC = 0;
		int jump = 0;
		int range = 0;
		int rangeCheck = 0;
		int arrayCheckPointer = 0;
		int stonesSize = 0;
		int currentPosition;
		
		TC = sc.nextInt();        
		for(test_case = 1; test_case <= TC; test_case++) {
			
			jump = 0;
			range = 0;
			rangeCheck = 0;
			arrayCheckPointer = 0;
			currentPosition = 0;
			
			// 돌의 갯수만큼 배열에 저장
			// 하면서 돌들의 거리 비교하면서 최대 필요한 거리 계산
			stones = new int[sc.nextInt()];
			stonesSize = stones.length;
			for (int i = 0; i < stonesSize; i++) {
				stones[i] = sc.nextInt();
				if (i > 0) {
					rangeCheck = rangeCheck >= stones[i] - stones[i - 1] ? rangeCheck : stones[i] - stones[i - 1];
				}
			}
			range = sc.nextInt();
			
			// 전체 이동한지 검사
			if (rangeCheck > range) {
				answerPrint(-1);
				continue;
			}
			
			// 실제 계산
			// stones를 하나씩 증가시키면서 range보다 같거나 작은 위치를 찾음
			while (arrayCheckPointer < stonesSize - 1) {
				
				for (int i = arrayCheckPointer + 1; i < stonesSize;i++) {
					
					if (range < stones[i] - currentPosition) {
						break;
					}
					arrayCheckPointer++;
				}
				currentPosition = stones[arrayCheckPointer];
				jump++;
			}
			// 이 부분에서 정답을 출력하십시오.
			answerPrint(jump);
		}
		sc.close();
	}

	private static void answerPrint(int count) {
		System.out.println("Case #" + test_case);
		System.out.println(count);
	}
}
