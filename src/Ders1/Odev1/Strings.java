package Ders1.Odev1;

public class Strings {
    public static void main(String[] args) {
        String mesaj = "Bugün Hava Çok Güzel.";
        //System.out.println(mesaj);
        // System.out.println("Eleman sayısı:"+mesaj.length());
        //System.out.println("5.Eleman:"+mesaj.charAt(5));

        //System.out.println(mesaj.concat(" Yaşasın!"));

        //System.out.println(mesaj.startsWith("B"));
        //System.out.println(mesaj.endsWith("."));

        //char[] karaterler = new char[5];
        //mesaj.getChars(0,5,karaterler,0);
        //System.out.println(karaterler);

        //System.out.println(mesaj.indexOf("av"));
        //System.out.println(mesaj.lastIndexOf("a"));

        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        System.out.println("-----------");
        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println("-----------");
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

    }
}
