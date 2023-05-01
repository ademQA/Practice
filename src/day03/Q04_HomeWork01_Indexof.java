package day03;

import java.util.Scanner;

public class Q04_HomeWork01_Indexof {
    public static void main(String[] args) {
        ///*
        //         * Ask the user for a String and a sentences
        //         * Find and print occurrence of String in sentences.
        //         * (without case sensitivity)
        //         * sentences =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
        //         * sentences =“I am coming” String=“com” output ="there is 1 “com” in sentences "
        //         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("input your text: ");
        String text= scanner.nextLine().toLowerCase();

        System.out.println("input your string you want to find: ");
        String str= scanner.next().toLowerCase();
        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = text.indexOf(str, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += str.length();
            }
        }if (count==0)
            System.out.println("There is not "+count+ "\""+str+"\" "+" in text");
        else if (count==1) {
            System.out.println("There is "+count+" \""+str+" \" "+" in text");
        } else  {
            System.out.println("There are "+count+" \""+str+"\" "+" in text");
        }


    }
}
