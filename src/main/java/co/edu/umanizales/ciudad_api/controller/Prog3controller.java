package co.edu.umanizales.ciudad_api.controller;


import co.edu.umanizales.ciudad_api.model.Typeofservice;
import co.edu.umanizales.ciudad_api.model.TransportP;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prog3")

public class Prog3controller {
    // greeting endpoint
    @GetMapping("hello champions")
    public String getHello() {
        System.out.println("Hello Champions");
        return "Hello Champions";
    }

    // service type

    @RestController
    @RequestMapping("Typeofservice")
    public class ServiceType {
        private final Typeofservice service = new Typeofservice("transport ", 3, "active");




        // roadsp



    }


}
