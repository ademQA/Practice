package day02;

import java.util.Scanner;

public class Q05_Homwork03_CaySeker {
    public static void main(String[] args) {
        /*
         * Write a Java program that asks to user 2 questions Question
         * 1 = how many tea do you drink in a day? Question
         * 2 = how many sugar do you use for a glass of tea?

         * Calculate how many sugar does user use as kilogram in a year and in 40 years
         * then print it on the console
         * If user doesn’t use sugar print “Good Job, less sugar more health”
         *
         * (Hint 1 sugar = 2.7 gr)
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir günde kaç bardak çay içtiğinizi giriniz: ");
        int caySayisi= scanner.nextInt();
        System.out.println("bir bardak çay için kullandığınız şeker adedinin  giriniz: ");
        int sekerSayisi= scanner.nextInt();
        if (sekerSayisi==0)
            System.out.println("Good Job, less sugar more health");
        else {
            System.out.println("bir yılda kullandığınız şeker miktarı: "+(365*caySayisi*sekerSayisi*2.7)/1000+" kg");
            System.out.println("kırk yılda kullandığınız şeker miktarı: "+(40*365*caySayisi*sekerSayisi)/1000+" kg");
        }

    }
}
