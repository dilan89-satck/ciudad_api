package co.edu.umanizales.ciudad_api.controller;

import co.edu.umanizales.ciudad_api.model.Incident;
import co.edu.umanizales.ciudad_api.service.IncidentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/incident")
public class IncidentController {
    private final IncidentService service;

    public IncidentController(IncidentService service) {
        this.service = service;
    }

    @GetMapping
    public Incident getSample() {
        return service.getSample();
    }

    @GetMapping("/description")
    public String getDescription() {
        return service.getSample().getDescription();
    }

    @GetMapping("/affected-people")
    public int getAffectedPeople() {
        return service.getSample().getAffectedPeople();
    }

    @GetMapping("/cost")
    public int getIncidentCost() {
        return service.getSample().getIncidentCost();
    }

    @GetMapping("/zone")
    public co.edu.umanizales.ciudad_api.model.Zone getZone() {
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
