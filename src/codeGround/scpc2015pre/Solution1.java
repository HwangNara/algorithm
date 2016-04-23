package codeGround.scpc2015pre;

/* �Ʒ� �⺻ ������ �ڵ带 ���� �Ǵ� �����ϰ� ������ �ڵ带 ����ϼŵ� �˴ϴ�.
��, ����ϴ� Ŭ�������� Solution �̾�� �ϸ�, ������ Solution.java �� ����� ���� �����մϴ�.
�̷��� ��Ȳ������ �����ϰ� java Solution ������� ���α׷��� ������ �� �� �ֽ��ϴ�. */
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution1 {
	
	static int[] stones;
	static int test_case = 0;
	
	public static void main(String args[]) throws Exception	{
		/* �Ʒ� �޼ҵ� ȣ���� ������ ǥ���Է�(Ű����) ��� input.txt ���Ϸ� ���� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�.
		   ���� ������ PC ���� �׽�Ʈ �� ����, �Է°��� input.txt�� ������ �� �� �ڵ带 ù �κп� ����ϸ�,
		   ǥ���Է� ��� input.txt ���Ϸ� ���� �Է°��� �о� �� �� �ֽ��ϴ�.
		   ����, ���� PC���� �Ʒ� �޼ҵ带 ������� �ʰ� ǥ���Է��� ����Ͽ� �׽�Ʈ�ϼŵ� �����մϴ�.
		   ��, Codeground �ý��ۿ��� "�����ϱ�" �� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ�(//) ó�� �ϼž� �մϴ�. */
		
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
			
			// ���� ������ŭ �迭�� ����
			// �ϸ鼭 ������ �Ÿ� ���ϸ鼭 �ִ� �ʿ��� �Ÿ� ���
			stones = new int[sc.nextInt()];
			stonesSize = stones.length;
			for (int i = 0; i < stonesSize; i++) {
				stones[i] = sc.nextInt();
				if (i > 0) {
					rangeCheck = rangeCheck >= stones[i] - stones[i - 1] ? rangeCheck : stones[i] - stones[i - 1];
				}
			}
			range = sc.nextInt();
			
			// ��ü �̵����� �˻�
			if (rangeCheck > range) {
				answerPrint(-1);
				continue;
			}
			
			// ���� ���
			// stones�� �ϳ��� ������Ű�鼭 range���� ���ų� ���� ��ġ�� ã��
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
			// �� �κп��� ������ ����Ͻʽÿ�.
			answerPrint(jump);
		}
		sc.close();
	}

	private static void answerPrint(int count) {
		System.out.println("Case #" + test_case);
		System.out.println(count);
	}
}
