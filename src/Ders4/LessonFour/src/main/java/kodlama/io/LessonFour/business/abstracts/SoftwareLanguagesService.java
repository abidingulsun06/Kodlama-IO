package kodlama.io.LessonFour.business.abstracts;

import kodlama.io.LessonFour.entities.concretes.SoftwareLanguages;

import java.util.List;

public interface SoftwareLanguagesService {
    List<SoftwareLanguages> getAll();
    void create(SoftwareLanguages softwareLanguages);
    void update(SoftwareLanguages softwareLanguages);
    void delete(int id);
    boolean dilVarmi(SoftwareLanguages softwareLanguages);
    SoftwareLanguages findById(int id);
}
