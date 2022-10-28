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
    public void create(SoftwareLanguages softwareLanguage) throws Exception {
        if(softwareLanguage.getSoftwareLanguagesName().length() != 0) {
            for(SoftwareLanguages sLanguages : softwareLanguagesRepository.getAll()) {
                if(sLanguages.getSoftwareLanguagesName().equalsIgnoreCase(softwareLanguage.getSoftwareLanguagesName())) {
                    throw new Exception("Aynı isimde 2 adet programlama dili olamaz.");
                }
            }
            softwareLanguagesRepository.create(softwareLanguage);
        } else {
            throw new Exception("Programlama dili boş geçilemez.");
        }
    }

    @Override
    public void update(SoftwareLanguages softwareLanguage) throws Exception {
        if(softwareLanguage.getSoftwareLanguagesName().length() != 0) {
            for(SoftwareLanguages sLanguages : softwareLanguagesRepository.getAll()) {
                if(sLanguages.getSoftwareLanguagesName().equalsIgnoreCase(softwareLanguage.getSoftwareLanguagesName())) {
                    throw new Exception("Güncelleme yapılırken bir hata oluştu. Aynı isimde 2 adet programlama dili olamaz.");
                }
            }
            softwareLanguagesRepository.update(softwareLanguage);
        } else {
            throw new Exception("Programlama dili boş geçilemez.");
        }
    }

    @Override
    public void delete(int id) {
        softwareLanguagesRepository.delete(findById(id).getSoftwareLanguagesId());
    }

    @Override
    public SoftwareLanguages findById(int id) {
        return softwareLanguagesRepository.findById(id);
    }
}
