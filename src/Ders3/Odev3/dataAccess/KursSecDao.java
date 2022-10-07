package Ders3.Odev3.dataAccess;

import Ders3.Odev3.entities.Egitmenler;
import Ders3.Odev3.entities.Kategoriler;
import Ders3.Odev3.entities.Kurslar;

public interface KursSecDao {
    void  add(Kurslar kurslar, Egitmenler egitmenler, Kategoriler kategoriler);
}
