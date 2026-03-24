package com.sra.dsa.twopointers.strings;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    private static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU";
        while(left < right){
            while (left< right && !(vowels.indexOf(chars[left]) != -1)) left++;
            while(left < right && !(vowels.indexOf(chars[right]) != -1)) right--;

            int temp = chars[left];
            chars[left] = chars[right];
            chars[right] = (char) temp;
            left++;
            right--;
        }
        return String.valueOf(chars);
    }
}
