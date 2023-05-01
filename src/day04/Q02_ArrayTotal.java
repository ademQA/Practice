package day04;

import java.util.Scanner;

public class Q02_ArrayTotal {
    public static void main(String[] args) {
        //Create an int array with the visa obtained from the user and add the sum of the elements in the array.
        //Write a java method that gives
        totalArray();
    }
    static  int size;
    static Scanner scanner=new Scanner(System.in);
    public static void totalArray(){
        System.out.println("please input array size: ");
        size=scanner.nextInt();
        int total=0;
        int[] employeeSalary=new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("input "+i+1+ ".salary of employee ");
            employeeSalary[i]=scanner.nextInt();
            total+=employeeSalary[i];
        }
        System.out.println("total salary of employee: "+total);
    }
}
