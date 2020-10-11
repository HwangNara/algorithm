package leetcode.problem.p0;

import java.util.LinkedList;
import java.util.List;

public class P859 {
    public static void main(String[] args) {
        System.out.println(new P859().buddyStrings("ab", "ca"));
        System.out.println(new P859().buddyStrings("ab", "ba"));
        System.out.println(new P859().buddyStrings("ab", "ab"));
        System.out.println(new P859().buddyStrings("aa", "aa"));
        System.out.println(new P859().buddyStrings("aaaaaaabc", "aaaaaaacb"));
        System.out.println(new P859().buddyStrings("", "aa"));
    }

    public boolean buddyStrings(String A, String B) {
        char[] lettersA = new char[26];
        int diffCount = 0;
        List<Character> diffA = new LinkedList<>();
        List<Character> diffB = new LinkedList<>();
        char diffLetterA = 'a';
        char diffLetterB = 'a';

        // size 다르면 false
        if (A.length() != B.length()) {
            return false;
        }
        for (int i = 0; i < A.length(); i++) {
            char charA = A.charAt(i);
            char charB = B.charAt(i);

            if (charA != charB) {
                diffA.add(charA);
                diffB.add(charB);
                diffCount++;

                if (diffCount == 1) {
                    diffLetterA = charA;
                    diffLetterB = charB;
                } else if (diffCount == 2) {
                    if (diffLetterA != charB || diffLetterB != charA) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            lettersA[charA - 'a']++;
        }
        // 다른 문자가 1번만 나오면 false
        if (diffCount == 1) {
            return false;
        }
        // 다른 문자 2번
        if (diffCount == 2) {
            return true;
        }

        // 문자가 다 같음
        //  같은 문자가 2개 이상 있으면 true
        for (char c : lettersA) {
            if (c >= 2) {
                return true;
            }
        }
        return false;
    }
}
