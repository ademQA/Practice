package day02;

import java.util.Scanner;

public class Q03_Homwork01_Sifre {
    public static void main(String[] args) {
        /*
         * ask user to create a password.
         * it should have at least
         * 1 special char
         * 1 uppercase
         * 1 lowercase
         * 1 digit
         * the length of password should be at least 8 characters
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir şifre giriiz :");
        String sifre = scanner.nextLine();

        boolean buyukmu=false;
        boolean kucukmu=false;
        boolean rakammi=false;
        boolean ozelKaraktermi=false;
        boolean enazSekizDigitmi=false;
        int sayac=0;

        for (int i = 0; i <= sifre.length() - 1; i++) {
            if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z')
             buyukmu = true;



            if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z')
            kucukmu = true;



            if (sifre.charAt(i) >= '0' && sifre.charAt(i) <= '9')
            rakammi = true;


            if (sifre.charAt(i) >32 || sifre.charAt(i)<126)
            ozelKaraktermi=true;


            if (sifre.length() >= 8)
            enazSekizDigitmi=true;


        }



        if (buyukmu==false)
            System.out.println("şifre büyük harf içermeli");
        else sayac++;

        if (kucukmu==false)
            System.out.println("şifre küçük harf içermeli");
        else sayac++;

        if (rakammi==false)
            System.out.println("şifre rakam içermeli");
        else sayac++;

        if (ozelKaraktermi==false)
            System.out.println("şifre özel karakter içermeli");
        else sayac++;

        if (enazSekizDigitmi==false)
          System.out.println("şifre en az 8 karakter olmalı");
        else sayac++;

        if (sayac == 5)
            System.out.println("şifre başarılı bir şekilde kaydoldİ");
        else System.out.println("şifreniz kaydedilemedi");

    }
}