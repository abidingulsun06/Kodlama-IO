package Ders2.Odev2;

public class Methods {
    public static void main(String[] args) {
        sayiBulma(9);
    }
    public static void sayiBulma(int par){
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = par;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi)
            mesajVer("Sayı Mevcuttur:"+par);
        else
            mesajVer("Sayı mevcut değildir:"+ par);
    }

    public static void mesajVer(String message){
        System.out.println(message);
    }

}
