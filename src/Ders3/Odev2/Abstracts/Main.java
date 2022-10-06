package Ders3.Odev2.Abstracts;

public class Main {
    public static void main(String[] args) {

        GameCalculater[] gameCalculater =  {new OlderGameCalculater(), new ManGameCalculater(), new WomanGameCalculater(), new KidsGameCalculater()};

        for (GameCalculater values : gameCalculater) {
            values.hesapla();
        }

    }
}
