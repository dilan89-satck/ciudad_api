package co.edu.umanizales.ciudad_api.service;

import co.edu.umanizales.ciudad_api.model.Zone;
import org.springframework.stereotype.Service;

@Service
public class ZoneService {
    public Zone getSample() {
        return Zone.show();
    }
}
