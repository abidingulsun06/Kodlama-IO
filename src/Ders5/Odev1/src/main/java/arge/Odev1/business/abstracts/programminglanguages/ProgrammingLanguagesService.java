package arge.Odev1.business.abstracts.programminglanguages;

import arge.Odev1.business.requests.programminglanguages.CreateProgrammingLanguagesRequest;
import arge.Odev1.business.requests.programminglanguages.UpdateProgrammingLanguagesRequest;
import arge.Odev1.business.responses.programminglanguages.GetAllProgrammingLanguagesResponse;
import arge.Odev1.business.responses.programminglanguages.GetByIdProgrammingLanguagesResponse;

import java.util.List;

public interface ProgrammingLanguagesService {
    List<GetAllProgrammingLanguagesResponse> getAll();
    void add(CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest);
    void update(UpdateProgrammingLanguagesRequest updateProgrammingLanguagesRequest);
    void delete(int id);
    GetByIdProgrammingLanguagesResponse getById(int id);

}
