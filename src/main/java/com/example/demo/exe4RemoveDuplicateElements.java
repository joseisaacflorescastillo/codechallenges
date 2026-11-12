package com.example.demo;

/*
Problem: Remove duplicate elements from an integer array while preserving insertion order.
Write a Java method that accepts an integer array and returns a new array containing only unique elements, maintaining their original order

1.Handle an empty array
2.Do not sort the array.
3.Use an appropriate Java Collection.
4.Implement the method in Java.

Input:  [4, 2, 4, 5, 2, 7, 5]

Output: [4, 2, 5, 7]
 */

import java.util.Arrays;
import java.util.LinkedHashSet;

public class exe4RemoveDuplicateElements {

    public static int[] removeDuplicates(int[] arr) {
        // 1. Manejar un arreglo vacío o nulo
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        // 3. Usar LinkedHashSet para eliminar duplicados y preservar el orden
        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        // Convertir el LinkedHashSet de vuelta a un arreglo primitivo int[]
        return uniqueSet.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        //exe4RemoveDuplicateElements exe4 = new exe4RemoveDuplicateElements();
        int[] input = {4, 2, 4, 5, 2, 7, 5};
        int[] output = removeDuplicates(input);
        System.out.println("Java 22 Output: " + Arrays.toString(output));
    }
}
