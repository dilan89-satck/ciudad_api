package co.edu.umanizales.ciudad_api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("PROG3")

public class Prog3controller {


    @GetMapping("Hola")

    public String GetHola(){
        System.out.println("Hola");
        return "Hola";
    }
}
