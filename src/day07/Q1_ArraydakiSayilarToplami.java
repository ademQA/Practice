package day07;

public class Q1_ArraydakiSayilarToplami {
    //Create an array of 5 floats and calculate their sum.
    public static void main(String[] args) {
        //float[]number=new float[5];
        float[] number = {1.1f, 2.2f, 3.3f, 4.4f, 5.5F};
        float toplam = 0;
        System.out.println(".......................ForLoop Çözümü...........................");
        for (int i = 0; i < number.length; i++) {
            toplam += number[i];
        }
        System.out.println("Toplam ForLoop= " + toplam);

        System.out.println(".......................WhileLoop Çözümü...........................");

        int index = 0;
        toplam = 0;
        while (index < number.length) {
            toplam += number[index];
            index++;
        }
        System.out.println("Toplam WhileLoop= " + toplam);

        System.out.println(".......................WhileLoop Çözümü2...........................");
         index =number.length-1;
        toplam = 0;
        while (index >=0) {
            toplam += number[index];
            index--;
        }
        System.out.println("Toplam WhileLoop Çözüm2= " + toplam);
    }
}
