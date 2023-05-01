package day02;

import java.util.Scanner;

public class Q04_Homwork02_KutleBoyIndeks {
    public static void main(String[] args) {
        /*
         * Write a Java program to compute body mass index (BMI)
         * print the situation.
         * Isuser weak, fat or obese ?
         * (Hint BMI = weight(kg)/ (height*height)(m)
         * BMI<20 weak
         * 20<BMI<25 healthy
         * 25<BMI<30 fat
         * Over 30 obese
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("boyunuzu giriniz: ");
        float boy= scanner.nextFloat();
        System.out.println("kilonuzu giriniz: ");
        int kilo= scanner.nextInt();
        double bmi=kilo/(boy*boy);
        System.out.println(bmi);
        if (bmi<=20){
            System.out.println("zayıf");}
        else if (bmi<=25) {
            System.out.println("normal");
        } else if (bmi<=30) {
            System.out.println("şişman");
        }else if (bmi>30){
            System.out.println("obez");
        }
    }
}
