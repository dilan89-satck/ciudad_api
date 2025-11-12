package co.edu.umanizales.ciudad_api.service;

import co.edu.umanizales.ciudad_api.model.Health;
import org.springframework.stereotype.Service;

@Service
public class HealthService {
    public Health getSample() {
        return Health.show();
    }
}
