package kodlama.io.LessonFour.webapi.controllers;

import kodlama.io.LessonFour.business.abstracts.SoftwareLanguagesService;
import kodlama.io.LessonFour.entities.concretes.SoftwareLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/softwarelanguages")
public class SoftwareLanguagesController {

    private SoftwareLanguagesService softwareLanguagesService;

    @Autowired
    public  SoftwareLanguagesController(SoftwareLanguagesService softwareLanguagesService){
        this.softwareLanguagesService=softwareLanguagesService;
    }

    @GetMapping("/getall")
    public List<SoftwareLanguages> getAll(){
        return softwareLanguagesService.getAll();
    }

    @PostMapping("/add")
    public void insert(@RequestBody SoftwareLanguages softwareLanguages) throws Exception {
        softwareLanguagesService.create(softwareLanguages);
    }

    @PutMapping("/update")
    public void update(@RequestBody SoftwareLanguages softwareLanguages) throws Exception{
        softwareLanguagesService.update(softwareLanguages);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam int id){
        softwareLanguagesService.delete(id);
    }

    @GetMapping("/findbyid")
    public SoftwareLanguages findById(@RequestParam int id){
      return softwareLanguagesService.findById(id);
    }
}
