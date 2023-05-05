package day06;

import java.util.Scanner;

public class C01_NextLineAtamaSorunu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adınızı Ve Soyadınızı giriniz: ");
        String name=scanner.nextLine();
        System.out.println("yaşınızı giriniz: ");
        int yas= scanner.nextInt();
        scanner.nextLine();
        System.out.println("mesleğinizi giriniz:");  //dummy sorunu
        String job=scanner.nextLine();
        scanner.close();
    }
}
