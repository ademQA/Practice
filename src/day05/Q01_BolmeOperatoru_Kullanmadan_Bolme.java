package day05;

import java.util.Scanner;

public class Q01_BolmeOperatoru_Kullanmadan_Bolme {
    static    int bolum=0;
    public static void main(String[] args) {
// // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
//    // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("bolmek istediğiniz sayıyı giriniz: ");
        int bolunecekSayi=scanner.nextInt();
        int sayi=bolunecekSayi;

        System.out.println("bolen  sayıyı giriniz: ");
        int bolenSayi=scanner.nextInt();
        System.out.println("bolum: "+bol(bolunecekSayi, bolenSayi));

        //  System.out.println(sayi+"/"+bolenSayi+" ="+bolum);
    }
   public static int bol(int bolunecekSayi, int bolenSayi){

       while (bolunecekSayi>=bolenSayi){
           bolunecekSayi-=bolenSayi;
           bolum++;}
       return bolum;
   }
}
