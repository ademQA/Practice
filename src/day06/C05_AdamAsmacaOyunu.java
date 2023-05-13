package day06;

import java.util.Scanner;

public class C05_AdamAsmacaOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] kelimeListesi = {"elma", "armut", "çilek", "portakal", "muz"};
        String kelime = kelimeListesi[(int) (Math.random() * kelimeListesi.length)];

        char[] tahmin = new char[kelime.length()];
        for (int i = 0; i < tahmin.length; i++) {
            tahmin[i] = '_';
        }

        int kalanHak = 6;
        boolean oyunDevamEdiyor = true;

        while (oyunDevamEdiyor) {
            System.out.print("Bir harf tahmin edin: ");
            char harf = scanner.nextLine().charAt(0);

            boolean dogruTahmin = false;

            for (int i = 0; i < kelime.length(); i++) {
                if (kelime.charAt(i) == harf) {
                    tahmin[i] = harf;
                    dogruTahmin = true;
                }
            }

            if (!dogruTahmin) {
                kalanHak--;
                System.out.println("Yanlış tahmin! Kalan hakkınız: " + kalanHak);
            }

            if (kalanHak == 0) {
                System.out.println("Oyunu kaybettiniz! Doğru kelime: " + kelime);
                oyunDevamEdiyor = false;
            }

            if (String.valueOf(tahmin).equals(kelime)) {
                System.out.println("Tebrikler, kazandınız! Doğru kelime: " + kelime);
                oyunDevamEdiyor = false;
            }

            System.out.println("Tahmin durumu: " + String.valueOf(tahmin));
            System.out.println("***************");
        }

    }
}
