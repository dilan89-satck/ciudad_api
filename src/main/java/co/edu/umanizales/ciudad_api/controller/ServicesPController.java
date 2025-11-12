package co.edu.umanizales.ciudad_api.controller;

import co.edu.umanizales.ciudad_api.model.ServicesP;
import co.edu.umanizales.ciudad_api.service.ServicesPService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ServicesPController {
    private final ServicesPService service;

    public ServicesPController(ServicesPService service) {
        this.service = service;
    }

    @GetMapping
    public ServicesP[] getAll() {
        return service.getAll();
    }
}
