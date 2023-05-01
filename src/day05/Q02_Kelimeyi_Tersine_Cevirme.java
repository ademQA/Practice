package day05;

import java.util.Scanner;

public class Q02_Kelimeyi_Tersine_Cevirme {
    public static void main(String[] args) {
        // SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
        // girilen değeri tersine  yazdıran bir method oluşturun

        Scanner scanner=new Scanner(System.in);
        System.out.println("cümlenizi giriniz: ");
        String metin=scanner.nextLine();
        System.out.println(tersineCevir(metin));
    }

    public static String tersineCevir(String metin){
        String tersMetin="";

        for (int i = metin.length()-1; i >=0; i--) {
            tersMetin+=metin.charAt(i);

        }
        return tersMetin;
    }
}
