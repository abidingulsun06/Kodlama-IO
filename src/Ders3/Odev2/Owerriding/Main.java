package Ders3.Odev2.Owerriding;

public class Main {
    public static void main(String[] args) {

       BaseCrediManager[] crediMananager = new BaseCrediManager[]{new OgretmenKrediManager(),new BaseCrediManager(),new OgrenciKrediManager()};

        for (BaseCrediManager kredi:crediMananager) {
            System.out.println(kredi.hesapla(599));
        }

    }
}
