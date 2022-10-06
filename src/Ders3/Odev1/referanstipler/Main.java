package Ders3.Odev1.referanstipler;


public class Main {
    public static void main(String[] args) {
        //Notlar

        //Referans tipler


        //ilkel tipler değer tiptir String hariç.
        //Stack
        int sayi1=10;
        int sayi2=20;

        //Heap
        sayi1=sayi2;
        sayi2=100;

        System.out.println(sayi1);

        //Diziler,classlar ve interfaceler referans tiptir
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{10, 20, 30};

        sayilar1 = sayilar2;
        sayilar2[0]=1000;

        System.out.println(sayilar1[0]);







    }
}





