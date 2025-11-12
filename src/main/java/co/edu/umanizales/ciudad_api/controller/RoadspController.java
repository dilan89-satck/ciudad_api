package co.edu.umanizales.ciudad_api.controller;

import co.edu.umanizales.ciudad_api.model.Roadsp;
import co.edu.umanizales.ciudad_api.model.Zone;
import co.edu.umanizales.ciudad_api.service.RoadspService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roadsp")
public class RoadspController {

    private final RoadspService service;

    public RoadspController(RoadspService service) {
        this.service = service;
    }

    // Objeto completo
    @GetMapping
    public Roadsp getSample() {
        return service.getSample();
    }

    // Atributos individuales
    @GetMapping("/damages")
    public String getDamages() {
        return service.getSample().getDamages();
    }

    @GetMapping("/incidents")
    public String getIncidents() {
        return service.getSample().getIncidents();
    }

    // Zona completa e individuales
    @GetMapping("/zone")
    public Zone getZone() {
        return service.getSample().getZone();
    }

    @GetMapping("/zone/neighborhood")
    public String getNeighborhood() {
        return service.getSample().getZone().getNeighborhood();
    }

    @GetMapping("/zone/commune")
    public String getCommune() {
        return service.getSample().getZone().getCommune();
    }

    @GetMapping("/zone/stratum")
    public String getStratum() {
        return service.getSample().getZone().getStratum();
    }
}
