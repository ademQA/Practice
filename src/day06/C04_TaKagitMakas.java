package day06;

import java.util.Random;
import java.util.Scanner;

public class C04_TaKagitMakas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int userChoice;
        int computerChoise;
        int userPoint=0;
        int computerPoint=0;
        do {
            System.out.println("Lütfen secim yapınız: \n1-Taş\n2-Kağıt\n3-Makas");
            userChoice=scanner.nextInt();
            computerChoise=random.nextInt(3)+1;
            if (userChoice==1 && computerChoise==2){
                System.out.println("bilgisayarın seçtiği "+computerChoise);
                System.out.println("");
                System.out.println("Kağıt taşı sarar--Bilgisayar kazandız");
                computerPoint++;
                System.out.println("sizin puanınız "+userPoint+ "\n"+"Bilgisayarın puanı: "+ computerPoint);
                System.out.println("");
            } else if (userChoice==1 && computerChoise==3) {
                System.out.println("bilgisayarın seçtiği "+computerChoise);
                System.out.println("");
                System.out.println("Taş Makası kırar--siz kazandız");
                userPoint++;
                System.out.println("sizin puanınız "+userPoint+ "\n"+"Bilgisayarın puanı: "+ computerPoint);
                System.out.println("");

            } else if (userChoice==2 &&computerChoise==1) {
                System.out.println("bilgisayarın seçtiği "+computerChoise);
                System.out.println("");
                System.out.println("Kağıt taşı sarar--siz kazandız");
                userPoint++;
                System.out.println("sizin puanınız "+userPoint+ "\n"+"Bilgisayarın puanı: "+ computerPoint);
                System.out.println("");

            } else if (userChoice==2 && computerChoise==3) {
                System.out.println("bilgisayarın seçtiği "+computerChoise);
                System.out.println("");
                System.out.println("Makas Kağıtı keser--Bilgisayar kazandız");
                computerPoint++;
                System.out.println("sizin puanınız "+userPoint+ "\n"+"Bilgisayarın puanı: "+ computerPoint);
                System.out.println("");
            } else if (userChoice==3&&computerChoise==1) {
                System.out.println("bilgisayarın seçtiği "+computerChoise);
                System.out.println("");
                System.out.println("Taş Makası kırar--Bilgisayar kazandız");
                computerPoint++;
                System.out.println("sizin puanınız "+userPoint+ "\n"+"Bilgisayarın puanı: "+ computerPoint);
                System.out.println("");
            } else if (userChoice==3 && computerChoise==2) {
                System.out.println("bilgisayarın seçtiği "+computerChoise);
                System.out.println("");
                System.out.println("Makas kağıtı keser--Siz kazandız");
                userPoint++;
                System.out.println("sizin puanınız "+userPoint+ "\n"+"Bilgisayarın puanı: "+ computerPoint);
                System.out.println("");
            }else {


                System.out.println("Bilgisayarla aynı secim yaptınız puan alamadınız");
                System.out.println("sizin puanınız "+userPoint+ "\n"+"Bilgisayarın puanı: "+ computerPoint);
            }
        }while (userPoint!=5 && computerPoint!=5);
        if (userPoint>computerPoint)
            System.out.println("Tebrikler siz Kazandınız");
        else
            System.out.println("Malesef kaybettiniz");
    }
}
