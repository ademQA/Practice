package day02;

import java.util.Scanner;

public class Q02_HesapMakinesi {
    public static void main(String[] args) {
        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabi tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        int sayi1= scanner.nextInt();
        System.out.println("2.sayıyı giriniz:");
        int sayi2= scanner.nextInt();
        System.out.println("işlem türünü giriniz 1:toplama 2:cikarma 3:carpma 4: bolme ");
        int islem= scanner.nextInt();
        if (islem==1){
            System.out.println("toplam="+sayi1+sayi2);
        } else if (islem==2) {
            System.out.println("fark="+(sayi1-sayi2));
        } else if (islem==3) {
            System.out.println("çarpım="+sayi1*sayi2);
        } else if (islem==4) {
            if (sayi2==0){
                System.out.println("sıfıra bölüm tanımsızdır");
            }else
            System.out.println("bölme="+sayi1/sayi2);
        }else System.out.println("hatalı işlem girdiniz");

        System.out.println("************************switch case*****************************");
        System.out.println("işlem işareti giriniz: +  - *  /");
        char islem1=scanner.next().charAt(0);
        switch (islem1){
            case '+':
                System.out.println("toplam="+sayi1+sayi2);break;
            case '-':
                System.out.println("fark="+(sayi1-sayi2));break;
            case '*':
                System.out.println("çarpım="+sayi1*sayi2);break;
            case '/':
            if (sayi2==0)
                System.out.println("sıfıra bölüm tanımsızdır");
            else
                System.out.println("bölme="+sayi1/sayi2);break;
         default:
            System.out.println("hatalı işlem girdiniz");}
    }
}
