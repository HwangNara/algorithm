package acmicpc.p3000;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3613 {
	
	static int len;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		len = str.length();
		
		boolean isJavaStyle = isJava(str);
		boolean isCppStyle = isCpp(str);
		
		if (!isJavaStyle && !isCppStyle) {
			System.out.println("Error!");
		} else if (isJavaStyle) {
			printCppStyle(str);
		} else if (isCppStyle) {
			printJavaStyle(str);
		}
		
	}

	private static void printJavaStyle(String str) {
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if (c == '_') c = str.toUpperCase().charAt(++i);
			System.out.print(c);
		}
	}
	
	private static void printCppStyle(String str) {
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if (isUpper(c)) {
				System.out.print("_");
				c = str.toLowerCase().charAt(i);
			}
			System.out.print(c);
		}
	}

	private static boolean isJava(String str) {
		
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if (i == 0 && isUpper(c)) return false;
			if (c == '_') return false;
		}
		return true;
	}


	private static boolean isCpp(String str) {
		boolean isPreUnder = false;
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			if (i == 0 && c == '_') return false;
			if (i == len - 1 && c == '_') return false;
			if (isPreUnder && c == '_') return false;
			if (c == '_') {
				isPreUnder = true;
				continue;
			}
			if (c - 'a' < 0) return false;
			isPreUnder = false;
		}
		return true;
	}

	private static boolean isUpper(char c) { return c - 'a' < 0; }
}
