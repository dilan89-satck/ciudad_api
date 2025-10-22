package co.edu.umanizales.ciudad_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prog3")

public class Prog3controller {

    @GetMapping("hola campeones")
    public String getHola() {
        System.out.println("Hola Camepeones");
        return "Hola Campeones";
    }
}
