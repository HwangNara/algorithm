package eulerProject;

public class P12 {

	public static void main(String[] args) {
		
		// �ﰢ���� ���ʷ� ���ϸ鼭 ���
		int num = 0;
		long triNum = 0;
		while (true ){
			// �ﰢ��
			triNum += num++;
			// �ﰢ���� ����� ���ʷ� 500�� �̻��̸� ������ 
			if (getSubmultipleNum(triNum) >= 500) break;
		}
		System.out.println(triNum);
	}

	private static int getSubmultipleNum(long triNum) {

		int numOfSubmultiple = 0;
		
		for (int i = 1; i <= (int)Math.sqrt(triNum); i++) {
			// �������� 1���� ���ϰ� ��
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
