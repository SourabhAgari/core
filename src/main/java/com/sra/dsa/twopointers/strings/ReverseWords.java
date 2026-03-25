package com.sra.dsa.twopointers.strings;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String[] temp = s.trim().split("\\s+");
        int left = 0, right = temp.length - 1;
        while (left < right){
            String tempInt = temp[left];
            temp[left] = temp[right];
            temp[right] = tempInt;

            left++;
            right--;
        }
        return String.join(" ", temp);
    }
}
