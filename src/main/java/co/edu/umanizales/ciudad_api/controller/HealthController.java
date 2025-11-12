package co.edu.umanizales.ciudad_api.controller;

import co.edu.umanizales.ciudad_api.model.Health;
import co.edu.umanizales.ciudad_api.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
    private final HealthService service;

    public HealthController(HealthService service) {
        this.service = service;
    }

    @GetMapping
    public Health getSample() {
        return service.getSample();
    }

    @GetMapping("/deaths")
    public double getNumberDeaths() {
        return service.getSample().getNumberDeaths();
    }

    @GetMapping("/recovered")
    public double getRecovered() {
        return service.getSample().getRecovered();
    }
}
