package kodlama.io.LessonFour.dataAccess.abstracts;

import kodlama.io.LessonFour.entities.concretes.SoftwareLanguages;

import java.util.List;

public interface SoftwareLanguagesRepository {
    List<SoftwareLanguages> getAll();
    void create(SoftwareLanguages softwareLanguages) throws Exception;
    void update(SoftwareLanguages softwareLanguages);
    void delete(int id);
    SoftwareLanguages findById(int id);

}
