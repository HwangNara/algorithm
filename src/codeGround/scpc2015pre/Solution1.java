package codeGround.scpc2015pre;

import java.util.ArrayList;
import java.util.List;
/* �Ʒ� �⺻ ������ �ڵ带 ���� �Ǵ� �����ϰ� ������ �ڵ带 ����ϼŵ� �˴ϴ�.
��, ����ϴ� Ŭ�������� Solution �̾�� �ϸ�, ������ Solution.java �� ����� ���� �����մϴ�.
�̷��� ��Ȳ������ �����ϰ� java Solution ������� ���α׷��� ������ �� �� �ֽ��ϴ�. */
import java.util.Scanner;
import java.io.FileInputStream;

public class Solution1 {
	public static void main(String args[]) throws Exception	{
		/* �Ʒ� �޼ҵ� ȣ���� ������ ǥ���Է�(Ű����) ��� input.txt ���Ϸ� ���� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�.
		   ���� ������ PC ���� �׽�Ʈ �� ����, �Է°��� input.txt�� ������ �� �� �ڵ带 ù �κп� ����ϸ�,
		   ǥ���Է� ��� input.txt ���Ϸ� ���� �Է°��� �о� �� �� �ֽ��ϴ�.
		   ����, ���� PC���� �Ʒ� �޼ҵ带 ������� �ʰ� ǥ���Է��� ����Ͽ� �׽�Ʈ�ϼŵ� �����մϴ�.
		   ��, Codeground �ý��ۿ��� "�����ϱ�" �� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ�(//) ó�� �ϼž� �մϴ�. */
		
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
			
			// �� �κп��� �˰��� ���α׷��� �ۼ��Ͻʽÿ�.
			numOfStone = sc.nextInt();
			for (int i = 0; i < numOfStone; i++) {
				list.add(sc.nextInt());
			}
			last = list.get(numOfStone - 1);
			range = sc.nextInt();
			
			int temp = 0;

			
			// ����
			
			while (cur < last) {
				
				boolean moved = false;
				// range��ŭ �������� 1ĭ ����
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
				// �ϳ��� �� ���������� Ż��
				if (!moved) {
					count = -1;
					break;
				}
			}
			
			for (int i : list) {
				System.out.print(i + ", " );
			}
			System.out.println();
			
			
			// �� �κп��� ������ ����Ͻʽÿ�.
			System.out.println("Case #" + test_case);
			System.out.println(count);
		}
		
		sc.close();
	}
}
