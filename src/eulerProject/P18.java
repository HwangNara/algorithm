package eulerProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P18 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("input_sample/P67.txt"));
		Scanner scan = new Scanner(System.in);
		
		List<Integer> listNum = new ArrayList<>();
		int[] nums;
		int counter = 0;
		int level = 1;
		
		// �ﰢ���� ������ ���� level ���� 
		while (scan.hasNext()) {
			listNum.add(Integer.parseInt(scan.next()));
			counter++;
			
			if (counter == level) {
				counter = 0;
				level++;
			}
		}
		
		// ������ ī��Ʈ �� level - 1
		level--;
		
		// sum���� ������ array
		nums = new int[listNum.size()];
		// �� ����
		for (int i = 0; i < listNum.size(); i++) {
			nums[i] = listNum.get(i);
		}
		listNum = null;
		
		int left = 0;
		int right = 0;
		int big = 0;
		int size = nums.length;
		int index = 0 ;
		
		for (int v = level; v > 0; v--) {
			
			index = size - v - (v - 1);
			
			// �ڱ⺸�� �Ʒ� Ȥ�� ������ �Ʒ� ���ؼ� ���ϱ�
			for (int i = 0; i < v - 1; i++) {
				left = nums[index + i + v - 1];
				right = nums[index + i + v];
				big = left > right ? left : right;
				nums[index + i] += big;
			}
			size -= v;
		}
		
		// ����
		System.out.println("answer : " + nums[0]);

		scan.close();
	}
}
