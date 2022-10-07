package Ders3.Odev3.business;

import Ders3.Odev3.core.Logger.IBaseLogger;
import Ders3.Odev3.dataAccess.KursSecDao;
import Ders3.Odev3.entities.Egitmenler;
import Ders3.Odev3.entities.Kategoriler;
import Ders3.Odev3.entities.Kurslar;

import java.util.ArrayList;

public class KursManager {

    private KursSecDao kursSecDao;
    private IBaseLogger[] baseLogger;
    private Egitmenler egitmenler;
    private Kategoriler[] kategoriler;

    public KursManager(KursSecDao kursSecDao, IBaseLogger[] baseLogger, Egitmenler egitmenler, Kategoriler[] kategoriler) {
        this.kursSecDao = kursSecDao;
        this.baseLogger = baseLogger;
        this.egitmenler = egitmenler;
        this.kategoriler = kategoriler;
    }

    public void addToCourse(ArrayList<Kurslar> courses, Kategoriler[] kategorilers) throws Exception {

        Kategoriler kategoriler1 = new Kategoriler(1, "Front end");
        Kurslar javaScript = new Kurslar(3, "Yazılım Geliştirici Yetiştirme Kampı Javascript", 33, kategoriler1.getKategoriAdi());

        for (Kurslar k : courses) {
            if (k.getKursAdi().equalsIgnoreCase(javaScript.getKursAdi()))
                throw new Exception("Ayni isimde 2 kurs bulunamaz");
            else if (k.getKursFiyati() <= 0 || javaScript.getKursFiyati() <= 0)
                throw new Exception("Kurs fiyatı 0 yada 0 dan küçük olamaz.");
        }

        for (Kategoriler categories : kategorilers) {
            if (categories.getKategoriAdi().equalsIgnoreCase(kategoriler1.getKategoriAdi()))
                throw new Exception("Ayni isimde 2 kategori olamaz");
        }

        for (IBaseLogger base : baseLogger) {
            base.logMessage(courses.get(1).getKursAdi());
        }

        for (int i = 0; i < courses.size(); i++) {
            kursSecDao.add(courses.get(i), egitmenler, kategoriler[i]);
            System.out.println();
        }
    }


}
