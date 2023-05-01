package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_ArrayList_Even_Number {
    public static void main(String[] args) {
//Write a method that assigns even numbers of a given array to a separate array
        int[] arr = {1, 3, 5, 4, 2, 7, 8, 9, 4, 12, 9, 8};
        System.out.println(evenNumber(arr));
    }

    public static List<Integer> evenNumber(int[] arr) {
        List<Integer>evenList=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
               evenList.add(arr[i]);
            }

        }return evenList;
    }
}