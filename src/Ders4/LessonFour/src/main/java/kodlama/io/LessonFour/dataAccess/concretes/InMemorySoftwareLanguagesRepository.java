package kodlama.io.LessonFour.dataAccess.concretes;


import kodlama.io.LessonFour.dataAccess.abstracts.SoftwareLanguagesRepository;
import kodlama.io.LessonFour.entities.concretes.SoftwareLanguages;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemorySoftwareLanguagesRepository implements SoftwareLanguagesRepository {

    List<SoftwareLanguages> softwareLanguages;

    public InMemorySoftwareLanguagesRepository() {
        softwareLanguages = new ArrayList<>();
        softwareLanguages.add(new SoftwareLanguages(1, "Java"));
        softwareLanguages.add(new SoftwareLanguages(2, "C#"));
        softwareLanguages.add(new SoftwareLanguages(3, "Python"));
        softwareLanguages.add(new SoftwareLanguages(4, "JavaScript"));
    }

    @Override
    public List<SoftwareLanguages> getAll() {
        return softwareLanguages;
    }

    @Override
    public void create(SoftwareLanguages softwareLanguage) {
         softwareLanguages.add(softwareLanguage);
    }

    @Override
    public void update(SoftwareLanguages softwareLanguage) {
        softwareLanguages.set(getById(softwareLanguage.getSoftwareLanguagesId()),softwareLanguage);
    }

    @Override
    public void delete(SoftwareLanguages softwareLanguage) {
         softwareLanguages.remove(findById(softwareLanguage.getSoftwareLanguagesId()));
    }

    @Override
    public boolean dilVarmi(SoftwareLanguages softwareLanguage) {
        if (softwareLanguage.getSoftwareLanguagesName()== softwareLanguage.getSoftwareLanguagesName()){
            return true;
        }
        return false;
    }

    @Override
    public SoftwareLanguages findById(int id) {
        return softwareLanguages.get(id);
    }

    private int getById(int id){
        SoftwareLanguages softwareLanguage = findById(id);
        return this.softwareLanguages.indexOf(softwareLanguage);
    }

}
