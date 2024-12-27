package com.example.demo;

public class exe2Palindrome {
    
    public static boolean palindrome(String s, String s2){
        String result = "";
        for (int i = s.length() - 1; i>=0; i--) {
            result += s.charAt(i);
        }
        return result.equals(s2);
    }
    public static void main(String[] args) {
        System.out.println(palindrome("101", "110"));
    }
}
