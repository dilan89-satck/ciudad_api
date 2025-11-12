package co.edu.umanizales.ciudad_api.service;

import co.edu.umanizales.ciudad_api.model.Typeofservice;
import org.springframework.stereotype.Service;

@Service
public class TypeofserviceService {
    public Typeofservice getSample() {
        return new Typeofservice("transport", 3, "active");
    }
}
