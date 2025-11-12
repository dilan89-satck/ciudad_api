package co.edu.umanizales.ciudad_api.service;

import co.edu.umanizales.ciudad_api.model.WasteCollection;
import org.springframework.stereotype.Service;

@Service
public class WasteCollectionService {
    public WasteCollection getSample() {
        return new WasteCollection("2 tons", 25, "daily");
    }
}
