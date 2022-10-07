package Ders3.Odev3.entities;

public class Kurslar extends Kategoriler{

    private int kursId;
    private String kursAdi;
    private double kursFiyati;

    public Kurslar() {
    }

    public Kurslar(int kursId, String kursAdi, double kursFiyati,String kategoriAdi) {
        this.kursId = kursId;
        this.kursAdi = kursAdi;
        this.kursFiyati = kursFiyati;
    }

    public double getKursFiyati() {
        return kursFiyati;
    }

    public void setKursFiyati(double kursFiyati) {
        this.kursFiyati = kursFiyati;
    }

    public int getKursId() {
        return kursId;
    }

    public void setKursId(int kursId) {
        this.kursId = kursId;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public void setKursAdi(String kursAdi) {
        this.kursAdi = kursAdi;
    }
}
