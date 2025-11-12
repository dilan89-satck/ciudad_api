package co.edu.umanizales.ciudad_api.service;

import co.edu.umanizales.ciudad_api.model.Roadsp;
import org.springframework.stereotype.Service;

@Service
public class RoadspService {
    public Roadsp getSample() {
        return Roadsp.show();
    }
}
