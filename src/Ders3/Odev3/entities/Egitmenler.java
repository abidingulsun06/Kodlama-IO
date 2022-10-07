package Ders3.Odev3.entities;

public class Egitmenler {

    private int egitmenId;
    private String egitmenAdi;
    private  String egitmenSoyadi;

    public String getEgitmenSoyadi() {
        return egitmenSoyadi;
    }

    public void setEgitmenSoyadi(String egitmenSoyadi) {
        this.egitmenSoyadi = egitmenSoyadi;
    }

    public Egitmenler() {
    }

    public Egitmenler(String egitmenAdi,String egitmenSoyadi) {
        this.egitmenAdi = egitmenAdi;
        this.egitmenSoyadi = egitmenSoyadi;
    }

    public int getEgitmenId() {
        return egitmenId;
    }

    public void setEgitmenId(int egitmenId) {
        this.egitmenId = egitmenId;
    }

    public String getEgitmenAdi() {
        return egitmenAdi;
    }

    public void setEgitmenAdi(String egitmenAdi) {
        this.egitmenAdi = egitmenAdi;
    }
}
