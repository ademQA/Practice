package day07;

import java.util.Scanner;

public class Q3_WhileLoop {
    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    //  Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
    //  while code blogu create ediniz.
    public static void main(String[] args) {
        double yukseklik;
        int yereVurusSayısı=0;
        double aldıgıYol=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Topun bırakılacağı yüksekliği giriniz: ");
        yukseklik=scanner.nextDouble();

        do {
            aldıgıYol+=yukseklik;
            yukseklik=yukseklik*0.75;
            yereVurusSayısı++;
            aldıgıYol+=yukseklik;

        }while (yukseklik>=1);

        System.out.println("aldığı yol: "+aldıgıYol);
        System.out.println("yere vuruş sayısı: "+yereVurusSayısı);
    }
}
