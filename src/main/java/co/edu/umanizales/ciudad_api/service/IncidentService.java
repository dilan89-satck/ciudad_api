package co.edu.umanizales.ciudad_api.service;

import co.edu.umanizales.ciudad_api.model.Incident;
import org.springframework.stereotype.Service;

@Service
public class IncidentService {
    public Incident getSample() {
        return Incident.show();
    }
}
