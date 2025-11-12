package co.edu.umanizales.ciudad_api.controller;

import co.edu.umanizales.ciudad_api.model.Citizens;
import co.edu.umanizales.ciudad_api.service.CitizensService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/citizens")
public class CitizensController {
    private final CitizensService service;

    public CitizensController(CitizensService service) {
        this.service = service;
    }

    @GetMapping
    public Citizens getSample() {
        return service.getSample();
    }

     @GetMapping("/count")
     public int getNumberCitizens() {
         return service.getSample().getNumberCitizens();
     }

     @GetMapping("/most-populated-area")
     public String getMostPopulatedArea() {
         return service.getSample().getMostPopulatedArea();
     }
}
