package day03;

import java.util.Scanner;

public class Q06HomeWork03_AdSoyad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ad Soyad giriniz: ");
        String adSoyad = scanner.nextLine();

        int index = adSoyad.indexOf(" ");
        String ad = adSoyad.substring(0, index);
        String soyad = adSoyad.substring(index + 1);

        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
    }
}
