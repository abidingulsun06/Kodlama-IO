package Ders1.Odev1;

public class mükkemmelSayilar {
    public static void main(String[] args) {
        int number = 28;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                total += i;
        }

        if (total == number)
            System.out.println("Mükkemmel sayıdır.");
        else
            System.out.println("Mükkemmel sayı değildir.");
    }
}
