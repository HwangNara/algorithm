package codeGround.scpc2015pre;

import java.util.ArrayList;
import java.util.List;
/* 아래 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도 됩니다.
단, 사용하는 클래스명이 Solution 이어야 하며, 가급적 Solution.java 를 사용할 것을 권장합니다.
이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해 볼 수 있습니다. */
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution1 {
	public static void main(String args[]) throws Exception	{
		/* 아래 메소드 호출은 앞으로 표준입력(키보드) 대신 input.txt 파일로 부터 읽어오겠다는 의미의 코드입니다.
		   만약 본인의 PC 에서 테스트 할 때는, 입력값을 input.txt에 저장한 후 이 코드를 첫 부분에 사용하면,
		   표준입력 대신 input.txt 파일로 부터 입력값을 읽어 올 수 있습니다.
		   또한, 본인 PC에서 아래 메소드를 사용하지 않고 표준입력을 사용하여 테스트하셔도 무방합니다.
		   단, Codeground 시스템에서 "제출하기" 할 때에는 반드시 이 메소드를 지우거나 주석(//) 처리 하셔야 합니다. */
		
		Scanner sc = new Scanner(new FileInputStream("frog_input.txt"));
     
//		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;
		
		TC = sc.nextInt();        
		for(test_case = 1; test_case <= TC; test_case++) {
			
			List<Integer> list = new ArrayList<>();
			int numOfStone;
			int count = 0;
			int range = 0;
			int cur = 0;
			int last = 0;
			
			// 이 부분에서 알고리즘 프로그램을 작성하십시오.
			numOfStone = sc.nextInt();
			for (int i = 0; i < numOfStone; i++) {
				list.add(sc.nextInt());
			}
			last = list.get(numOfStone - 1);
			range = sc.nextInt();
			
			int temp = 0;

			
			// ㄱㄱ
			
			while (cur < last) {
				
				boolean moved = false;
				// range만큼 돌려봐서 1칸 전진
				for (int i = range; i > 0; i--) {
					
					temp = cur + i;
					
					if (list.contains(temp)) {
						
						list.remove(list.indexOf(temp));
						moved = true;
						cur = temp;
						count++;
						break;
					}
				}
				// 하나도 못 움직였으면 탈락
				if (!moved) {
					count = -1;
					break;
				}
			}
			
			for (int i : list) {
				System.out.print(i + ", " );
			}
			System.out.println();
			
			
			// 이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
			System.out.println(count);
		}
		
		sc.close();
	}
}
