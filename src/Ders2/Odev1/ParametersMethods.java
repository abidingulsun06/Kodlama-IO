package Ders2.Odev1;

public class ParametersMethods {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(11,12);
        System.out.println(sayi);
        int toplam = topla2(1,2,3,4,515,12);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void güncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    //varaible arguments
    public static int topla2(int... sayilar){
    int toplam=0;
        for (int sayi: sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }


    public static String sehirVer() {
        return "Ankara";
    }
}
