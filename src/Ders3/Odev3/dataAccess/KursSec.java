package Ders3.Odev3.dataAccess;

import Ders3.Odev3.entities.Egitmenler;
import Ders3.Odev3.entities.Kategoriler;
import Ders3.Odev3.entities.Kurslar;

public class KursSec implements KursSecDao {
    @Override
    public void add(Kurslar kurslar, Egitmenler egitmenler, Kategoriler kategoriler){
        System.out.println(kurslar.getKursAdi() + egitmenler.getEgitmenAdi()
                + egitmenler.getEgitmenSoyadi() + kategoriler.getKategoriAdi());
    }


}
