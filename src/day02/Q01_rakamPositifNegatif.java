package day02;

import java.util.Scanner;

public class Q01_rakamPositifNegatif {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayi= scanner.nextInt();
        if (sayi>=0){
            if (sayi<10){
                System.out.println("rakam:"+sayi);
            }else {
                System.out.println("pozitif sayı:"+sayi);
            }
        }else {
            System.out.println("negatif sayı:"+sayi);
        }
        System.out.println("**********************2.çözüm************************");
        if (sayi>=0 &&sayi<10) System.out.println("rakam");
        else if (sayi>=10) {
            System.out.println("pozitif sayı");
        }else System.out.println("negatif sayı");
        System.out.println("****************ternary çözüm************************");
        boolean sart1=sayi>=0;
        boolean sart2=sayi<10;
        String sonuc=(sart1)?(sart2?"rakam":"pozitif"):"Negatif Sayı";
        System.out.println(sonuc);
    }
}
