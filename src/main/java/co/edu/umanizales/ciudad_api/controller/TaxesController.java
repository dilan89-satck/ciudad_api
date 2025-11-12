package co.edu.umanizales.ciudad_api.controller;

import co.edu.umanizales.ciudad_api.model.Taxes;
import co.edu.umanizales.ciudad_api.service.TaxesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/taxes")
public class TaxesController {
    private final TaxesService service;

    public TaxesController(TaxesService service) {
        this.service = service;
    }

    @GetMapping
    public Taxes getSample() {
        return service.getSample();
    }

    @GetMapping("/collection")
    public int getCollection() {
        return service.getSample().getCollection();
    }

    @GetMapping("/debt")
    public int getDebt() {
        return service.getSample().getDebt();
    }

    @GetMapping("/time")
    public String getTime() {
        return service.getSample().getTime();
    }
}
