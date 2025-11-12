package co.edu.umanizales.ciudad_api.service;

import co.edu.umanizales.ciudad_api.model.TransportP;
import org.springframework.stereotype.Service;

@Service
public class TransportPService {
    public TransportP getSample() {
        return new TransportP("line1 ", 300, 45);
    }
}
