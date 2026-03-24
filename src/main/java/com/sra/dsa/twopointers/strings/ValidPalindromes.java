package com.sra.dsa.twopointers.strings;

public class ValidPalindromes {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));


    }

    private static boolean isPalindrome(String s){
        if(s == null) return false;
        int left = 0, right = s.length() - 1;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        }

        return true;
    }
}
