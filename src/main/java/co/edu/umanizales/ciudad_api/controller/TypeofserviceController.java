package co.edu.umanizales.ciudad_api.controller;

import co.edu.umanizales.ciudad_api.model.Typeofservice;
import co.edu.umanizales.ciudad_api.service.TypeofserviceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/typeofservice")
public class TypeofserviceController {

    private final TypeofserviceService service;

    public TypeofserviceController(TypeofserviceService service) {
        this.service = service;
    }

    @GetMapping
    public Typeofservice getSample() {
        return service.getSample();
    }

    @GetMapping("/servicename")
    public String getServicename() {
        return service.getSample().getServicename();
    }

    @GetMapping("/commune")
    public int getCommune() {
        return service.getSample().getCommune();
    }

    @GetMapping("/state")
    public String getState() {
        return service.getSample().getState();
    }
}
