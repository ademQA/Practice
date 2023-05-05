package day06;

public class C02_ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i + " ");

        }
        System.err.println("işlem tamam");
    }
}
