package kodlama.io.LessonFour.business.concretes;

import kodlama.io.LessonFour.business.abstracts.SoftwareLanguagesService;
import kodlama.io.LessonFour.dataAccess.abstracts.SoftwareLanguagesRepository;
import kodlama.io.LessonFour.entities.concretes.SoftwareLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareLanguagesManager implements SoftwareLanguagesService {

    private SoftwareLanguagesRepository softwareLanguagesRepository;

    @Autowired
    public SoftwareLanguagesManager(SoftwareLanguagesRepository softwareLanguagesRepository) {
        this.softwareLanguagesRepository = softwareLanguagesRepository;
    }

    @Override
    public List<SoftwareLanguages> getAll() {
        return softwareLanguagesRepository.getAll();
    }

    @Override
    public void create(SoftwareLanguages softwareLanguage) {
        if (softwareLanguagesRepository.dilVarmi(softwareLanguage)) {
            softwareLanguagesRepository.create(softwareLanguage);
        } else {
            System.out.println("Veri Eklenirken bir hata oluştu isim tekrar edilemez");
            return;
        }
    }

    @Override
    public void update(SoftwareLanguages softwareLanguage) {
        if (softwareLanguagesRepository.dilVarmi(softwareLanguage)) {
            softwareLanguagesRepository.update(softwareLanguage);
        } else {
            System.out.println("Veri Güncellenirken bir hata oluştu isim tekrar edilemez");
            return;
        }
    }

    @Override
    public void delete(int id) {
        softwareLanguagesRepository.delete(softwareLanguagesRepository.findById(id));
    }

    @Override
    public boolean dilVarmi(SoftwareLanguages softwareLanguages) {
        if (softwareLanguagesRepository.dilVarmi(softwareLanguages))
            return true;
        else
            return false;
    }

    @Override
    public SoftwareLanguages findById(int id) {
        return softwareLanguagesRepository.findById(id);
    }
}
