package arge.Odev1.wepapi.controllers.technologies;

import arge.Odev1.business.abstracts.technologies.TechnologiesService;
import arge.Odev1.business.requests.technologies.CreateTechnologiesRequest;
import arge.Odev1.business.requests.technologies.UpdateTechnologiesRequest;
import arge.Odev1.business.responses.technologies.GetAllTechnologiesResponse;
import arge.Odev1.business.responses.technologies.GetByIdTechnologiesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
public class TecnologiesController {

    private TechnologiesService technologiesService;

    @Autowired
    public TecnologiesController(TechnologiesService technologiesService) {
        this.technologiesService = technologiesService;
    }

    @GetMapping("/getall")
    public List<GetAllTechnologiesResponse> getAll() {
        return technologiesService.getAll();
    }

    @PostMapping("/add")
    public void insert(@RequestBody CreateTechnologiesRequest createTechnologiesRequest) {
        this.technologiesService.add(createTechnologiesRequest);
    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateTechnologiesRequest updateTechnologiesRequest) {
        this.technologiesService.update(updateTechnologiesRequest);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam("id") int id) {
        this.technologiesService.delete(id);
    }

    @GetMapping("/findbyid")
    public GetByIdTechnologiesResponse getById(@RequestParam("technologiesId") int id) {
        return this.technologiesService.findById(id);
    }
}
