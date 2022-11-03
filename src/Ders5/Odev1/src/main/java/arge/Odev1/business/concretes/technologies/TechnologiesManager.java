package arge.Odev1.business.concretes.technologies;

import arge.Odev1.business.abstracts.technologies.TechnologiesService;
import arge.Odev1.business.requests.technologies.CreateTechnologiesRequest;
import arge.Odev1.business.requests.technologies.UpdateTechnologiesRequest;
import arge.Odev1.business.responses.technologies.GetAllTechnologiesResponse;
import arge.Odev1.business.responses.technologies.GetByIdTechnologiesResponse;
import arge.Odev1.dataAccess.abstracts.programminglanguages.PorgrammingLanguagesRepository;
import arge.Odev1.dataAccess.abstracts.technologies.TechnologiesRepository;
import arge.Odev1.entities.concretes.programminglanguages.ProgrammingLanguages;
import arge.Odev1.entities.concretes.technologies.Technologies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnologiesManager implements TechnologiesService {
    private TechnologiesRepository technologiesRepository;
    private PorgrammingLanguagesRepository porgrammingLanguagesRepository;

    @Autowired
    public TechnologiesManager(TechnologiesRepository technologiesRepository, PorgrammingLanguagesRepository porgrammingLanguagesRepository) {
        this.technologiesRepository = technologiesRepository;
        this.porgrammingLanguagesRepository = porgrammingLanguagesRepository;
    }


    @Override
    public List<GetAllTechnologiesResponse> getAll() {
        List<Technologies> technologies = this.technologiesRepository.findAll();
        List<GetAllTechnologiesResponse> technologiesResponse = new ArrayList<>();

        for (Technologies technologiesEntity : technologies) {
            GetAllTechnologiesResponse responseItem = new GetAllTechnologiesResponse();

            responseItem.setTechnologiesId(technologiesEntity.getTechnologiesId());
            responseItem.setName(technologiesEntity.getName());
            responseItem.setProgrammingLanguageName(technologiesEntity.getProgrammingLanguages().getName());

            technologiesResponse.add(responseItem);
        }
        return technologiesResponse;
    }

    @Override
    public void add(CreateTechnologiesRequest createTechnologiesRequest) {
        Technologies technologies = new Technologies();
        ProgrammingLanguages programmingLanguages =
                porgrammingLanguagesRepository.
                        findById(createTechnologiesRequest.getProgrammingLanguageId()).get();
        technologies.setName(createTechnologiesRequest.getName());
        technologies.setProgrammingLanguages(programmingLanguages);

        this.technologiesRepository.save(technologies);
    }

    @Override
    public void update(UpdateTechnologiesRequest updateTechnologiesRequest) {
        Technologies technologies = new Technologies();
        ProgrammingLanguages programmingLanguages =
                porgrammingLanguagesRepository.
                        findById(updateTechnologiesRequest.getProgrammingLanguageId()).get();
        technologies.setTechnologiesId(updateTechnologiesRequest.getTechnologiesId());
        technologies.setName(updateTechnologiesRequest.getName());

        this.technologiesRepository.save(technologies);
    }

    @Override
    public void delete(int id) {
        this.technologiesRepository.deleteById(id);
    }

    @Override
    public GetByIdTechnologiesResponse findById(int id) {
       Technologies technologies = technologiesRepository.getReferenceById(id);
       GetByIdTechnologiesResponse getByIdTechnologiesResponse = new GetByIdTechnologiesResponse();

       getByIdTechnologiesResponse.setId(technologies.getTechnologiesId());
       getByIdTechnologiesResponse.setProgrammingLanguageName(technologies.getProgrammingLanguages().getName());
       getByIdTechnologiesResponse.setName(technologies.getName());

       return getByIdTechnologiesResponse;
    }


}
