package day05;

import java.util.Scanner;

public class C03_StringOrtadakiKarakter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word;
        System.out.println("word giriniz");
        word=scanner.next();
        int boyut=word.length();
        if (boyut%2==0){
           word=word.substring(boyut/2-1,boyut/2+1);
        }
        else {
            word=word.substring(boyut/2,boyut/2+1);
        }
        System.out.println(word);
    }

}
