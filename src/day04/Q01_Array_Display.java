package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_Array_Display {
    public static void main(String[] args) {
//Create a Java Program that displays the values of an array
printArrayMethod();
    }

    static  int size;
    static Scanner scanner=new Scanner(System.in);
    public static void printArrayMethod(){
        System.out.println("please input array size: ");
        size=scanner.nextInt();
        int[] studentAge=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("input "+i+1+ ".age of students: ");
            studentAge[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(studentAge));
    }
}
