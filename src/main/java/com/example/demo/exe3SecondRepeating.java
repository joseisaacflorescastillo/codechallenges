package com.example.demo;

public class exe3SecondRepeating {
    public static char  secondNonRepeating(String s) {
        int[] count = new int[256];

        //contar caracteres
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                count[c]++;
            }
        }
        int found = 0;

        //buscar el segundo no repetido
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ' && count[c] == 1){
                found++;
                if (found == 2) {
                    return c;
                }
            }

        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println(secondNonRepeating("a b c a d e c"));
    }
}
