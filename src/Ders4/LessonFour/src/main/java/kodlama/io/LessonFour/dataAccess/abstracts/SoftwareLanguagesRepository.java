package kodlama.io.LessonFour.dataAccess.abstracts;

import kodlama.io.LessonFour.entities.concretes.SoftwareLanguages;

import java.util.List;

public interface SoftwareLanguagesRepository {
    List<SoftwareLanguages> getAll();
    void create(SoftwareLanguages softwareLanguages)  ;
    void update(SoftwareLanguages softwareLanguages);
    void delete(SoftwareLanguages softwareLanguages);
    boolean dilVarmi(SoftwareLanguages softwareLanguages);
    SoftwareLanguages findById(int id);

}
