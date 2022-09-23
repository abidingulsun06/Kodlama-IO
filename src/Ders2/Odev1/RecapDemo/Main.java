package Ders2.Odev1.RecapDemo;

public class Main {
    public static void main(String[] args) {

        DortIslem dortıslem = new DortIslem();

        dortıslem.result("işlemin sonucu:"+dortıslem.topla(10,20));
        dortıslem.result("işlemin sonucu:"+dortıslem.cıkar(30,20));
        dortıslem.result("işlemin sonucu:"+dortıslem.carp(10,2));
        dortıslem.result("işlemin sonucu:"+dortıslem.bolme(10,2));

    }
}
