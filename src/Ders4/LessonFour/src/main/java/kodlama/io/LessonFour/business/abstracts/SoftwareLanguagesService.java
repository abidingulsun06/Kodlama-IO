package kodlama.io.LessonFour.business.abstracts;

import kodlama.io.LessonFour.entities.concretes.SoftwareLanguages;

import java.util.List;

public interface SoftwareLanguagesService {
    List<SoftwareLanguages> getAll();
    void create(SoftwareLanguages softwareLanguages) throws Exception;
    void update(SoftwareLanguages softwareLanguages) throws Exception;
    void delete(int id);
    SoftwareLanguages findById(int id);
}
