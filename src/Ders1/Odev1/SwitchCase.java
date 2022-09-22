package Ders1.Odev1;

public class SwitchCase {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel : Gectiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi : Gectiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Gectiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz Bir Not Giridiniz!!!");

        }
    }
}
