package co.edu.umanizales.ciudad_api.controller;

import co.edu.umanizales.ciudad_api.model.Zone;
import co.edu.umanizales.ciudad_api.service.ZoneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zone")
public class ZoneController {
    private final ZoneService service;

    public ZoneController(ZoneService service) {
        this.service = service;
    }

    @GetMapping
    public Zone getSample() {
        return service.getSample();
    }

    @GetMapping("/neighborhood")
    public String getNeighborhood() {
        return service.getSample().getNeighborhood();
    }

    @GetMapping("/commune")
    public String getCommune() {
        return service.getSample().getCommune();
    }

    @GetMapping("/stratum")
    public String getStratum() {
        return service.getSample().getStratum();
    }
}
