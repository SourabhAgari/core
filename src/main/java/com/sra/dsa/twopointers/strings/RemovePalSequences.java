package com.sra.dsa.twopointers.strings;

public class RemovePalSequences {
    public static void main(String[] args) {
        String s = "baabb";
        System.out.println(removePalindromeSub(s));
    }

    private static int removePalindromeSub(String s) {
        if (s.isEmpty()) return 0;
        else if (ValidPalindrome.validPalindrome(s)) return 1;
        else return 2;
    }
}
