package co.edu.umanizales.ciudad_api.service;

import co.edu.umanizales.ciudad_api.model.Taxes;
import org.springframework.stereotype.Service;

@Service
public class TaxesService {
    public Taxes getSample() {
        return Taxes.show();
    }
}
