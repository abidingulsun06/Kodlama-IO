package Ders3.Odev3.dataAccess;

import Ders3.Odev3.entities.Egitmenler;
import Ders3.Odev3.entities.Kategoriler;
import Ders3.Odev3.entities.Kurslar;

public class JdbcKursDao implements KursSecDao {
    @Override
    public void add(Kurslar kurslar, Egitmenler egitmenler, Kategoriler kategoriler) {
            System.out.println("Jdbc ile kurs alindı:\nKurs:" + kurslar.getKursAdi()
                    + "\nEgitmen:" + egitmenler.getEgitmenAdi() + egitmenler.getEgitmenSoyadi() + "\nKategori:" + kategoriler.getKategoriAdi());
    }
}
