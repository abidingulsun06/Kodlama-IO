package Ders3.Odev3.entities;

public class Kategoriler {
    private int kategoriId;
    private String kategoriAdi;

    public  Kategoriler(){
    }

    public Kategoriler(int kategoriId, String kategoriAdi) {
        this.kategoriId = kategoriId;
        this.kategoriAdi = kategoriAdi;
    }

    public int getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(int kategoriId) {
        this.kategoriId = kategoriId;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }
}
