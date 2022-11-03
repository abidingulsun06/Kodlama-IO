package arge.Odev1.business.concretes.programminglanguages;

import arge.Odev1.business.abstracts.programminglanguages.ProgrammingLanguagesService;
import arge.Odev1.business.requests.programminglanguages.CreateProgrammingLanguagesRequest;
import arge.Odev1.business.requests.programminglanguages.UpdateProgrammingLanguagesRequest;
import arge.Odev1.business.responses.programminglanguages.GetAllProgrammingLanguagesResponse;
import arge.Odev1.business.responses.programminglanguages.GetByIdProgrammingLanguagesResponse;
import arge.Odev1.dataAccess.abstracts.programminglanguages.PorgrammingLanguagesRepository;
import arge.Odev1.entities.concretes.programminglanguages.ProgrammingLanguages;
import arge.Odev1.entities.concretes.technologies.Technologies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguagesManager implements ProgrammingLanguagesService {

    private PorgrammingLanguagesRepository porgrammingLanguagesRepository;

    @Autowired
    public ProgrammingLanguagesManager(PorgrammingLanguagesRepository porgrammingLanguagesRepository) {
        this.porgrammingLanguagesRepository = porgrammingLanguagesRepository;
    }

    @Override
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        List<ProgrammingLanguages> programmingLanguages = porgrammingLanguagesRepository.findAll();
        List<GetAllProgrammingLanguagesResponse> programmingLanguagesResponse = new ArrayList<>();

        for (ProgrammingLanguages pLanguages : programmingLanguages) {
            GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
            responseItem.setId(pLanguages.getId());
            responseItem.setName(pLanguages.getName());
            programmingLanguagesResponse.add(responseItem);
        }
        return programmingLanguagesResponse;
    }

    @Override
    public void add(CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest) {
        ProgrammingLanguages programmingLanguages = new ProgrammingLanguages();
        programmingLanguages.setName(createProgrammingLanguagesRequest.getName());
        this.porgrammingLanguagesRepository.save(programmingLanguages);
    }

    @Override
    public void update(UpdateProgrammingLanguagesRequest updateProgrammingLanguagesRequest) {
        ProgrammingLanguages programmingLanguages = new ProgrammingLanguages();
        Technologies technologies = new Technologies();
        programmingLanguages.setId(updateProgrammingLanguagesRequest.getId());
        programmingLanguages.setName(updateProgrammingLanguagesRequest.getName());
        this.porgrammingLanguagesRepository.save(programmingLanguages);
    }

    @Override
    public void delete(int id) {
        this.porgrammingLanguagesRepository.deleteById(id);
    }

    @Override
    public GetByIdProgrammingLanguagesResponse getById(int id) {
        ProgrammingLanguages programmingLanguages = porgrammingLanguagesRepository.getReferenceById(id);
        GetByIdProgrammingLanguagesResponse getByIdProgrammingLanguagesResponse = new GetByIdProgrammingLanguagesResponse();

        getByIdProgrammingLanguagesResponse.setId(programmingLanguages.getId());
        getByIdProgrammingLanguagesResponse.setName(programmingLanguages.getName());

        return getByIdProgrammingLanguagesResponse;
    }


}
