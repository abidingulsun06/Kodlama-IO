package Ders3.Odev3;

import Ders3.Odev3.business.KursManager;
import Ders3.Odev3.core.Logger.EmailLogger;
import Ders3.Odev3.core.Logger.FileLogger;
import Ders3.Odev3.core.Logger.IBaseLogger;
import Ders3.Odev3.core.Logger.SmsLogger;
import Ders3.Odev3.dataAccess.JdbcKursDao;
import Ders3.Odev3.dataAccess.KursSecDao;
import Ders3.Odev3.entities.Egitmenler;
import Ders3.Odev3.entities.Kategoriler;
import Ders3.Odev3.entities.Kurslar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Egitmenler enginDemirog = new Egitmenler("Engin","Demiroğ");

        IBaseLogger[] baseLogger ={new EmailLogger(),new FileLogger(),new SmsLogger()};

        Kategoriler frontEnd = new Kategoriler(1,"Front end Programming");
        Kategoriler backend = new Kategoriler(2,"Backend Object orianted");
        Kategoriler gameProgramming = new Kategoriler(3,"Game Programming");

        Kategoriler[] kategorilers ={frontEnd,backend,gameProgramming};

        Kurslar java = new Kurslar(1, "Yazılım Geliştirici Yetiştirme Kampı react", 10,kategorilers[0].getKategoriAdi());

        Kurslar python = new Kurslar(2, "Yazılım Geliştirici Yetiştirme Kampı java", 65.00, kategorilers[1].getKategoriAdi());

        Kurslar charp = new Kurslar(3, "Yazılım Geliştirici Yetiştirme Kampı c#", 76.88, kategorilers[2].getKategoriAdi());

        ArrayList<Kurslar> courses = new ArrayList<>();
        courses.add(java);
        courses.add(python);
        courses.add(charp);

        KursSecDao myCourse = new JdbcKursDao();

        KursManager kursManager = new KursManager(myCourse,baseLogger,enginDemirog,kategorilers);
        kursManager.addToCourse(courses,kategorilers);



    }
}
