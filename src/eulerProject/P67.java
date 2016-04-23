package eulerProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P67 {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("P18.txt"));
		Scanner scan = new Scanner(System.in);
		
		List<Integer> listNum = new ArrayList<>();
		int[] nums;
		int counter = 0;
		int level = 1;
		
		while (scan.hasNext()) {
			listNum.add(Integer.parseInt(scan.next()));
			counter++;
			
			if (counter == level) {
				counter = 0;
				level++;
			}
		}
		
		
		level--;
		// sum들을 저장할 array
		nums = new int[listNum.size()];
		for (int i = 0; i < listNum.size(); i++) {
			nums[i] = listNum.get(i);
		}
		
		int left = 0;
		int right = 0;
		int big = 0;
		int size = listNum.size();
		
		for (int v = level; v > 0; v--) {
			
			int index = size - v - (v - 1);
			
			for (int i = 0; i < v - 1; i++) {
				left = nums[index + i + v - 1];
				right = nums[index + i + v];
				big = left > right ? left : right;
				nums[index + i] += big;
			}
			
			size -= v;
		}
		
		System.out.println("answer : " + nums[0]);
		
		scan.close();
	}
}
