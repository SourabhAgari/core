package com.sra.dsa.twopointers.strings;

public class isSubSequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    private static boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        if (s.length() > t.length()) return false;
        int left = 0, right = 0;
        while (left < s.length() && right < t.length()) {
            if(s.charAt(left) == t.charAt(right)) {
                left++;
                right++;
            } else {
                right++;
            }
        }
        return left == s.length();
    }
}
