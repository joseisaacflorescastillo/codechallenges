package com.example.demo;

public class exe1ReverseString {

    public static String ReverseStringNative(String s){
        String result = "";
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseString(String s){
        String result = "";
        for (int i = s.length() - 1; i >=0 ; i--) {
            // System.out.println(s.charAt(i));
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ReverseStringNative("Automation"));
        System.out.println(reverseString("Automation"));
    }
}
