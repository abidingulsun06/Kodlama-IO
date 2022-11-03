package arge.Odev1.wepapi.controllers.programminglanguages;

import arge.Odev1.business.abstracts.programminglanguages.ProgrammingLanguagesService;
import arge.Odev1.business.requests.programminglanguages.CreateProgrammingLanguagesRequest;
import arge.Odev1.business.requests.programminglanguages.UpdateProgrammingLanguagesRequest;
import arge.Odev1.business.responses.programminglanguages.GetAllProgrammingLanguagesResponse;
import arge.Odev1.business.responses.programminglanguages.GetByIdProgrammingLanguagesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

    private ProgrammingLanguagesService programmingLanguagesService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguagesService programmingLanguagesService) {
        this.programmingLanguagesService = programmingLanguagesService;
    }

    @GetMapping("/getall")
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        return programmingLanguagesService.getAll();
    }

    @PostMapping("/add")
    public void insert(@RequestBody CreateProgrammingLanguagesRequest createProgrammingLanguagesRequest) {
        programmingLanguagesService.add(createProgrammingLanguagesRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateProgrammingLanguagesRequest updateProgrammingLanguagesRequest) {
        programmingLanguagesService.update(updateProgrammingLanguagesRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam(value = "id") int id) {
        programmingLanguagesService.delete(id);
    }

    @GetMapping("/findbyid")
    public GetByIdProgrammingLanguagesResponse findById(@RequestParam("id") int id) {
        return this.programmingLanguagesService.getById(id);
    }
}
