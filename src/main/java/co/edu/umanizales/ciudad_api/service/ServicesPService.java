package co.edu.umanizales.ciudad_api.service;

import co.edu.umanizales.ciudad_api.model.ServicesP;
import org.springframework.stereotype.Service;

@Service
public class ServicesPService {
    public ServicesP[] getAll() {
        return ServicesP.values();
    }
}
