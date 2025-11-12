package co.edu.umanizales.ciudad_api.controller;

import co.edu.umanizales.ciudad_api.model.WasteCollection;
import co.edu.umanizales.ciudad_api.service.WasteCollectionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/waste-collection")
public class WasteCollectionController {
    private final WasteCollectionService service;

    public WasteCollectionController(WasteCollectionService service) {
        this.service = service;
    }

    @GetMapping
    public WasteCollection getSample() {
        return service.getSample();
    }

    @GetMapping("/amount-trash")
    public String getAmountTrash() {
        return service.getSample().getAmountTrash();
    }

    @GetMapping("/number-employees")
    public int getNumberEmployees() {
        return service.getSample().getNumberEmployees();
    }

    @GetMapping("/frequency")
    public String getFrequency() {
        return service.getSample().getFrequency();
    }
}
