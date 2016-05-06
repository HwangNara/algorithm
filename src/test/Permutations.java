package test;

/******************************************************************************
 *  Compilation:  javac Permutations.java
 *  Execution:    java Permutations N
 *  
 *  Enumerates all permutations on N elements.
 *  Two different approaches are included.
 *
 *  % java Permutations 3
 *  abc
 *  acb
 *  bac 
 *  bca
 *  cab
 *  cba
 *
 ******************************************************************************/

public class Permutations {

    // print N! permutation of the characters of the string s (in order)
    public  static void perm1(String s) { 
    	perm1("", s); 
    }
    private static void perm1(String prefix, String s) {
        int N = s.length();
        if (N == 0) {
//        	System.out.println(prefix);
        }
        else {
            for (int i = 0; i < N; i++)
               perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, N));
        }
    }

    public static void main(String[] args) {
        int N = 13;
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String elements = alphabet.substring(0, N);
        
        long startTime = System.currentTimeMillis();
        long endTime = 0L;
        perm1(elements);
        endTime = System.currentTimeMillis();
        System.out.println("걸린 시간 : " + (endTime - startTime) + "ms");
    }
}