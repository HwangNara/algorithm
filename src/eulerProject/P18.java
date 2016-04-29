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
		
		// 삼각형의 갯수에 따라 level 지정 
		while (scan.hasNext()) {
			listNum.add(Integer.parseInt(scan.next()));
			counter++;
			
			if (counter == level) {
				counter = 0;
				level++;
			}
		}
		
		// 마지막 카운트 된 level - 1
		level--;
		
		// sum들을 저장할 array
		nums = new int[listNum.size()];
		// 값 복사
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
			
			// 자기보다 아래 혹은 오른쪽 아래 비교해서 더하기
			for (int i = 0; i < v - 1; i++) {
				left = nums[index + i + v - 1];
				right = nums[index + i + v];
				big = left > right ? left : right;
				nums[index + i] += big;
			}
			size -= v;
		}
		
		// 정답
		System.out.println("answer : " + nums[0]);

		scan.close();
	}
}
