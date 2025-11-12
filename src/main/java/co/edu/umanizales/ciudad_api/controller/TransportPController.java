package co.edu.umanizales.ciudad_api.controller;

import co.edu.umanizales.ciudad_api.model.TransportP;
import co.edu.umanizales.ciudad_api.service.TransportPService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transport")
public class TransportPController {
    private final TransportPService service;

    public TransportPController(TransportPService service) {
        this.service = service;
    }

    @GetMapping
    public TransportP getSample() {
        return service.getSample();
    }

    @GetMapping("/route")
    public String getRoute() {
        return service.getSample().getRoute();
    }

    @GetMapping("/passengers")
    public int getNumberPassengers() {
        return service.getSample().getNumberpassengers();
    }

    @GetMapping("/drivers")
    public int getNumberDrivers() {
        return service.getSample().getNumberdrivers();
    }
}
