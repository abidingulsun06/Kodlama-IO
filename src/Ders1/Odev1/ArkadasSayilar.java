package Ders1.Odev1;

public class ArkadasSayilar {
    public static void main(String[] args) {
        int sayi1 = 220;
        int sayi2 = 284;
        int tooplam1 = 0;
        int tooplam2 = 0;


        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0)
                tooplam1 += i;
        }

        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0)
                tooplam2 += i;
        }

        if (sayi1==tooplam2 && sayi2 == tooplam1)
            System.out.println("Bu iki sayı arkadaştır.");
        else
            System.out.println("Bu iki sayı arkadaş değildir.");
    }

}
