package co.edu.umanizales.ciudad_api.service;

import co.edu.umanizales.ciudad_api.model.Citizens;
import org.springframework.stereotype.Service;

@Service
public class CitizensService {

    public Citizens getSample() {
        return Citizens.show();
    }
}
